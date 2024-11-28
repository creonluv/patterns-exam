package org.example.flyweightcity;

import java.util.HashMap;
import java.util.Map;

public class BuildingFactory {
    private final Map<String, BuildingFlyweight> flyweights = new HashMap<>();

    public BuildingFlyweight getBuilding(String name, String texture, String color) {
        String key = name + "-" + texture + "-" + color;

        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new ConcreteBuildingFlyweight(name, texture, color));
        }

        return flyweights.get(key);
    }
}