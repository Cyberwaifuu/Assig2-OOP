package com.station.wagon;

public class Lux extends Wagon{

    public int numberOfPeople;
    public static int numberOfCoupe = 8;
    public final static double cost = 26133;
    public Lux(int weight, int volume,int numberOfPeople,int numberOfCoupe) {
        super(weight, volume);
        this.numberOfPeople = numberOfPeople;
        this.numberOfCoupe = numberOfCoupe;
    }

    @Override
    public double overallWeight(){
        return weight + (numberOfPeople * 60);
    }

    @Override
    public int getPeople(){
        return numberOfPeople;
    }
    @Override
    public int getCoupe(){
        return numberOfCoupe;
    }

    public final double getCost() {
        return cost;
    }
}
