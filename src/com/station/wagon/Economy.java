package com.station.wagon;

public class Economy extends Wagon{
    public int numberOfPeople;
    public static int numberOfCoupe = 12;
    public final static double cost = 7810;
    public Economy(int weight, int volume,int numberOfPeople, int numberOfCoupe) {
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
    @Override
    public final double getCost() {
        return cost;
    }
}
