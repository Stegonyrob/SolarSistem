package dev.stella.solarSistem.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Planet {
    private String name;
    private int satelite;
    private double mass;
    private double volume;
    private int diameter;
    private int distanceTotheSunn;
    private String type;
    private boolean observable;
    
    
    public Planet(String name, int satelite, double mass, double volume, int diameter, int distanceTotheSunn,
            String type, boolean observable) {
        this.name = name;
        this.satelite = satelite;
        this.mass = mass;
        this.volume = volume;
        this.diameter = diameter;
        this.distanceTotheSunn = distanceTotheSunn;
        this.type = type;
        this.observable = observable;
    }
    
}
