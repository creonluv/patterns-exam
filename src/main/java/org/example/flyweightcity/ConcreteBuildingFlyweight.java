package org.example.flyweightcity;

import java.awt.*;

class ConcreteBuildingFlyweight implements BuildingFlyweight {
    private final String name;
    private final String texture;
    private final String color;

    public ConcreteBuildingFlyweight(String name, String texture, String color) {
        this.name = name;
        this.texture = texture;
        this.color = color;
    }

    @Override
    public void display(Graphics g, int x, int y) {
        System.out.println("Building Name: " + name);
        System.out.println("Building Color: " + color);
        System.out.println("Building Texture: " + texture);
        System.out.println("Position: (" + x + ", " + y + ")");
        System.out.println("-----");

        g.setColor(Color.decode(color));
        g.fillRect(x, y, 50, 50);

        g.setColor(Color.BLACK);
        g.drawString(name, x + 5, y + 25);
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
