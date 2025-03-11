package org.example._2025_03_11;

import java.util.ArrayList;
import java.util.List;

public class GoodYear {
    private List<String> seasons = new ArrayList<>();

    public void addSeason(Season season) {
        seasons.add(season.name());
    }

    @Override
    public String toString() {
        return "GoodYear{" +
                "seasons=" + seasons +
                '}';
    }
}
