package org.example.flyweightcity;

import javax.swing.*;

public class FlyweightExample {
    public static void main(String[] args) {
        BuildingFactory factory = new BuildingFactory();
        City city = new City();

        BuildingFlyweight house = factory.getBuilding("House", "Brick", "#FF5733");
        BuildingFlyweight skyscraper = factory.getBuilding("Skyscraper", "Glass", "#33A1FF");

        city.addBuilding(50, 50, house);
        city.addBuilding(150, 50, house);
        city.addBuilding(250, 50, skyscraper);
        city.addBuilding(350, 50, skyscraper);

        JFrame frame = new JFrame("City Renderer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        SwingCityRenderer renderer = new SwingCityRenderer(city);
        frame.add(renderer);

        frame.setVisible(true);
    }
}