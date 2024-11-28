package org.example.flyweightcity;

import java.util.ArrayList;
import java.util.List;

public class City {
    private final List<BuildingContext> buildings = new ArrayList<>();

    public void addBuilding(int x, int y, BuildingFlyweight flyweight) {
        buildings.add(new BuildingContext(x, y, flyweight));
    }

    public List<BuildingContext> getBuildings() {
        return buildings;
    }
}