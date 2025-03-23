package org.example._2025_03_23;

import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        List<Skill> requiredSkills = List.of(Skill.PLOTNIK, Skill.SHTUKATUR, Skill.ELECTRIC);

        Brigade brigade = new Brigade(List.of(
                new Worker("1", Set.of(Skill.PLOTNIK, Skill.SHTUKATUR)),
                new Worker("2", Set.of(Skill.PLOTNIK, Skill.MALYAR)),
                new Worker("3", Set.of(Skill.PLOTNIK, Skill.SHTUKATUR, Skill.ELECTRIC))));

        System.out.println(brigade.isSuitable(requiredSkills));
        System.out.println(brigade.isSuitableOptimized(requiredSkills));

    }
}
