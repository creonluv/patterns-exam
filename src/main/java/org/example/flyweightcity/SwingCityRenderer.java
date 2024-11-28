package org.example.flyweightcity;

import javax.swing.*;
import java.awt.*;

public class SwingCityRenderer extends JPanel implements CityRenderer {
    private final City city;

    public SwingCityRenderer(City city) {
        this.city = city;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        renderCity(g);
    }

    @Override
    public void renderCity(Graphics g) {
        for (BuildingContext building : city.getBuildings()) {
            building.render(g);
        }
    }
}