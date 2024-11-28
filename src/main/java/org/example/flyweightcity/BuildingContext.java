package org.example.flyweightcity;

import java.awt.*;

public class BuildingContext {
    private final int x;
    private final int y;
    private final BuildingFlyweight flyweight;

    public BuildingContext(int x, int y, BuildingFlyweight flyweight) {
        this.x = x;
        this.y = y;
        this.flyweight = flyweight;
    }

    public void render(Graphics g) {
        flyweight.display(g, x, y);
    }
}
