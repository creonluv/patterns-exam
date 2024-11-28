package org.example.flyweightcity;


import org.example.flyweightcity.Building;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class BuildingPanel extends JPanel {
    private final List<Building> buildings = new ArrayList<>();

    // Додаємо будівлю для відображення
    public void addBuilding(Building building) {
        buildings.add(building);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Building building : buildings) {
            // Малюємо будівлю
            building.display(g);  // Викликаємо display, передаючи Graphics
        }
    }
}