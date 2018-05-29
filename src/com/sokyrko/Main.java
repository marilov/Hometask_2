package com.sokyrko;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CarManager carManager = new CarManager();
        carManager.setupEngine("2.4", 40, true);

        carManager.setupAirCondition("17 C", false);

        carManager.setupCarInfo("BMW", "X5", 2012);

        carManager.startCar();
    }
}