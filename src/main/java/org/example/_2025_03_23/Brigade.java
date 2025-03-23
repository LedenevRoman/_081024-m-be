package org.example._2025_03_23;

import java.util.*;

public class Brigade {
    private final List<Worker> workers;

    public Brigade(List<Worker> workers) {
        this.workers = workers;
    }

    public boolean isSuitable(List<Skill> requiredSkills) {
        for (List<Skill> combination : getAllSkillCombinations()) {
            if (isCombinationContainsAll(combination, requiredSkills)) {
                return true;
            }
        }
        return false;
    }

    private Set<List<Skill>> getAllSkillCombinations() {
        Set<List<Skill>> result = new HashSet<>();
        fillInResultSet(0, new LinkedList<>(), result);
        return result;
    }

    private void fillInResultSet(int workerIndex, List<Skill> currentCombination, Set<List<Skill>> result) {
        if (workerIndex == workers.size()) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }
        Worker worker = workers.get(workerIndex);
        for (Skill skill : worker.getSkills()) {
            currentCombination.add(skill);
            fillInResultSet(workerIndex + 1, currentCombination, result);
            currentCombination.removeLast();
        }
    }

    private boolean isCombinationContainsAll(List<Skill> combination, List<Skill> requiredSkills) {
        Map<Skill, Integer> skillCountCombinationMap = toMap(combination);
        Map<Skill, Integer> skillCountRequiredMap = toMap(requiredSkills);

        for (Map.Entry<Skill, Integer> entry : skillCountRequiredMap.entrySet()) {
            if (!skillCountCombinationMap.containsKey(entry.getKey())) {
                return false;
            } else {
                Integer countInCombination = skillCountCombinationMap.get(entry.getKey());
                if (countInCombination < entry.getValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    private Map<Skill, Integer> toMap(List<Skill> combination) {
        Map<Skill, Integer> result = new EnumMap<>(Skill.class);
        for (Skill skill : combination) {
            result.merge(skill, 1, (oldValue, newValue) -> oldValue + 1);
        }
        return result;
    }

//более оптимизированный вариант, не перебираем все возможные комбинации, а "откатываемся" на шаг назад, если текущая комбинация не подходит.
    public boolean isSuitableOptimized(List<Skill> requiredProfessions) {
        Map<Skill, Worker> skillAssignedWorkerMap = new EnumMap<>(Skill.class);
        Set<Worker> usedWorkers = new HashSet<>();
        return tryToMap(requiredProfessions, 0, skillAssignedWorkerMap, usedWorkers);
    }

    private boolean tryToMap(List<Skill> requiredSkills,
                             int requiredSkillIndex,
                             Map<Skill, Worker> skillWorkerMap,
                             Set<Worker> usedWorkers) {
        if (requiredSkillIndex == requiredSkills.size()) {
            return true;
        }

        Skill profession = requiredSkills.get(requiredSkillIndex);

        for (Worker worker : workers) {
            if (worker.canTake(profession) && !usedWorkers.contains(worker)) {
                skillWorkerMap.put(profession, worker);
                usedWorkers.add(worker);

                if (tryToMap(requiredSkills, requiredSkillIndex + 1, skillWorkerMap, usedWorkers)) {
                    return true;
                } else {
                    skillWorkerMap.remove(profession);
                    usedWorkers.remove(worker);
                }
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Brigade brigade)) return false;
        return Objects.equals(workers, brigade.workers);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(workers);
    }

    @Override
    public String toString() {
        return "Brigade{" +
                "workers=" + workers +
                '}';
    }
}
