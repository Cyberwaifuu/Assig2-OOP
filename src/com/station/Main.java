package com.station;

import com.station.train.freigTrain;
import com.station.train.passTrain;
import com.station.wagon.*;

public class Main {

    public static void main(String[] args) {
        int totWeightp = 0;
        int totWeightf = 0;

        freigTrain freight = new freigTrain();
        passTrain passenger = new passTrain();


        Wagon[] cargo = new Wagon[4];
        cargo[0] = new Locomotive(4000, 20);
        cargo[1] = new FreightWagon(2500, 25, 3000, "wood");
        cargo[2] = new FreightWagon(2000, 30, 6000, "metal");
        cargo[3] = new FreightWagon(2250, 35, 2000, "grain");

        System.out.println("Train service team: " + freight);
        System.out.println("Train info:");

        System.out.println(cargo[0]);
        for (Wagon wagon : cargo) {
            System.out.println("Wagon: ");
            freight.giveInfo(wagon);
        }


        for (int i = 0 ;i<4 ;i++)
            totWeightf+= cargo[i].overallWeight();


        System.out.println("Overall weight of Freight Train: " + totWeightf + "kg.");
        System.out.println("Max. speed of Freight Train: " + Math.sqrt(cargo[0].getPower()*2/totWeightf)+"km/h");



        Wagon[] pass = new Wagon[6];
        pass[0] = new Locomotive(4000,20);
        pass[1] = new Economy(3000,30,24,12);
        pass[2] = new Economy(3000,30,24,12);
        pass[3] = new Lux(3000,40,10,10);
        pass[4] = new Lux(3000,40,10,10);
        pass[5] = new Lux(3000,40,14,10);
        System.out.println("Train service team: " + passenger);
        System.out.println("Train info:");

        System.out.println(pass[0]);
        for (Wagon wagon : pass){
            System.out.println("Wagon: ");
            passenger.giveInfo(wagon);
        }

        for (int i = 0; i<6 ;i++) {
            totWeightp += pass[i].overallWeight();
        }

        System.out.println("Total weight of Passenger Train: " + totWeightp + "kg.");
        System.out.println("Max. speed of Passenger Train: " + Math.sqrt(pass[0].getPower()*2/totWeightp)+"km/h");


    }
}

