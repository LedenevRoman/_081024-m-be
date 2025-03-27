package org.example._2025_03_27;

import java.util.*;
import java.util.stream.Collectors;

public class StringTaskByStream {
    public static void main(String[] args) {
        String s = "Once upon, a time a up at all upon?";

        List<String> words = List.of(s.toLowerCase().replaceAll("[\\P{L}&&[^\\s']]", "").split(" "));

        Map<Character, TreeSet<String>> map = words.stream()
                .map(word -> word + " " + Collections.frequency(words, word))
                .collect(Collectors.groupingBy(w -> Character.toUpperCase(w.charAt(0)), TreeMap::new,
                        Collectors.toCollection(TreeSet::new)));

        System.out.println(map);

        String result = map.entrySet().stream().map(entry -> {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(entry.getKey())
                            .append(": ")
                            .append(entry.getValue().pollFirst())
                            .append("\n");
                    entry.getValue().forEach(string -> stringBuilder.append("   ")
                            .append(string)
                            .append("\n"));
                    return stringBuilder;
                })
                .collect(Collectors.joining());

        System.out.println(result);
    }
}
