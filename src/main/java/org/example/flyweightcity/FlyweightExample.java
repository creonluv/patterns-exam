package org.example.flyweightcity;

import org.example.flyweightcity.Building;
import org.example.flyweightcity.BuildingFactory;
import org.example.flyweightcity.BuildingFlyweight;
import org.example.flyweightcity.BuildingPanel;

import javax.swing.*;

public class FlyweightExample {
    public static void main(String[] args) {
        BuildingFactory factory = new BuildingFactory();

        BuildingFlyweight house = factory.getBuilding("House", "Brick", "#FF5733");
        BuildingFlyweight skyscraper = factory.getBuilding("Skyscraper", "Glass", "#33A1FF");

        BuildingPanel panel = new BuildingPanel();

        panel.addBuilding(new Building(50, 50, house));
        panel.addBuilding(new Building(150, 50, house));
        panel.addBuilding(new Building(250, 50, skyscraper));
        panel.addBuilding(new Building(350, 50, skyscraper));

        JFrame frame = new JFrame("City Simulation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.add(panel);
        frame.setVisible(true);
    }
}