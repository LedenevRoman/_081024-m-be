package org.example._2025_03_11;

import java.util.ArrayList;
import java.util.List;

public class BadYear {
    private List<String> seasons = new ArrayList<>();

    public void addSeason(String season) {
        seasons.add(season);
    }

    @Override
    public String toString() {
        return "BadYear{" +
                "seasons=" + seasons +
                '}';
    }
}
