package org.example._2025_03_17;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Skill> requiredSkills = List.of(Skill.PLOTNIK, Skill.SHTUKATUR, Skill.ELECTRIC);

        Brigade brigade = new Brigade(List.of(
                new Worker("1", List.of(Skill.PLOTNIK, Skill.SHTUKATUR)),
                new Worker("2", List.of(Skill.PLOTNIK, Skill.MALYAR)),
                new Worker("3", List.of(Skill.PLOTNIK, Skill.SHTUKATUR, Skill.ELECTRIC))));

        System.out.println(brigade.isSuitable(requiredSkills));
        System.out.println(brigade.isSuitableOptimized(requiredSkills));

    }
}
