package com.station.train;

import com.station.driver.Professionals;
import com.station.wagon.Wagon;

public class passTrain {
    Professionals command = new Professionals("Mugen Train","14");

    public void giveInfo(Wagon wagon){
        System.out.print("Weight: "+wagon.weight+"kg || ");
        System.out.println("Amount of people: "+wagon.getPeople());
        System.out.println("Amount of coupe: "+wagon.getCoupe());
        System.out.println("Price for 1 ticket: "+wagon.getCost()+"₸");
    }

    public String toString(){
        return  "\n" + command.name + "\n"
                +"The team consists of " + command.size + " members";
    }
}
