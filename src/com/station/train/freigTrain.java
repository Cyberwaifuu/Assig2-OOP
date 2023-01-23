package com.station.train;

import com.station.driver.Professionals;
import com.station.wagon.Wagon;

public class freigTrain {
    Professionals command = new Professionals("Kabaneri of the Iron Fortress","10");

    public void giveInfo(Wagon wagon){
        System.out.print("Weight: "+wagon.weight+"kg || ");
        System.out.print("Volume: "+wagon.volume+"m3 || ");
        System.out.print("Product: "+wagon.getProduct()+" || ");
        System.out.println("Overall weight of wagon: "+wagon.overallWeight()+"kg");
    }


    public String toString(){
        return  "\n" + command.name+"\n"
                +"The team consists of " + command.size + " members";
    }
}

