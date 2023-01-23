package com.station.wagon;

import com.station.engine.Engine;

public class Locomotive extends Wagon {
    Engine engine = new Engine();

    public Locomotive(int weight, int volume) {
        super(weight, volume);
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public double overallWeight(){
        return weight;
    }

    public String toString(){
        return "Locomotive: " + "\n" + "Engine power: " + engine.power + " || Manufacturer: " + engine.manufacturer;
    }

    @Override
    public double getPower(){
        return engine.power;
    }

}
