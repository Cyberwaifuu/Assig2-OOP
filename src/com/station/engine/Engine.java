package com.station.engine;

import java.util.Scanner;

public class Engine {
    Scanner scan = new Scanner(System.in);
    public double power;
    public String manufacturer;

    public Engine(double power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }
    public Engine() {
        System.out.println("Choose Locomotive's manufacturer: ");
        System.out.println("China"+"\n"+"Kazakhstan"+"\n"+"Japan");
        while(true){
            this.manufacturer = scan.nextLine();
            switch(manufacturer) {
                case "China":
                    power = 315000000;
                    break;
                case "Kazakhstan":
                    power = 157000000;
                    break;
                case "Japan":
                    power = 125000000;
                    break;
                default:
                    System.out.println("We don't have such locomotives");
            }
            if(power != 0) {
                break;
            }
        }
    }



    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
