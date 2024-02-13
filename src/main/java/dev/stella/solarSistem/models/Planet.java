package dev.stella.solarSistem.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Planet {
    private String name;//null
    private int satelite;//0
    private double mass;//0kg
    private double volume;//0km cubicos
    private int diameter;//0km
    private int distanceTotheSunn;//millones de km 0km
    private String type;// gaseoso,terrestre,o enano
    private boolean observable;//false or true a simple vista
    
    
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
