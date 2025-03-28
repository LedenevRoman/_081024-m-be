package org.example._2025_03_23;

import java.util.Objects;
import java.util.Set;

public class Worker {
    private final String id;
    private final Set<Skill> skills;

    public Worker(String id, Set<Skill> skills) {
        this.id = id;
        this.skills = skills;
    }

    public boolean canTake(Skill profession) {
        return skills.contains(profession);
    }

    public Set<Skill> getSkills() {
        return skills;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Worker worker)) return false;
        return Objects.equals(id, worker.id) && Objects.equals(skills, worker.skills);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, skills);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id='" + id + '\'' +
                ", skills=" + skills +
                '}';
    }
}

