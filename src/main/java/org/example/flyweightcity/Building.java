package org.example.flyweightcity;

import java.awt.*;

public class Building {
    private final int x;
    private final int y;
    private final BuildingFlyweight flyweight;

    public Building(int x, int y, BuildingFlyweight flyweight) {
        this.x = x;
        this.y = y;
        this.flyweight = flyweight;
    }

    public void display(Graphics g) {
        flyweight.display(g, x, y);
    }}
