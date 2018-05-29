package com.sokyrko;

import java.util.Scanner;

/**
 * This class contains information about the car characteristics.
 * If you choose to start a car you get calculation about your speed, distance, fuel consumption.
 * If you choose not to start a car you get list of car characteristics.
 */
public class CarManager {
    private double power = 40;
    private double volume = 6;
    private boolean engineState;
    private double temperature;
    private boolean airState = true;
    private String brand = "BMW";
    private String model = "X5";
    private int productionYear = 2015;
    private int speed;
    private int distance;

    /**
     * This method allows to choose whether to start a car or not.
     * If yes - system asks user to continue with questions, if no - system shows car characteristics.
     */
    public void startCar() {
        System.out.println("Would you like to start a car? yes/no");
        Scanner scanner = new Scanner(System.in);
        if (scanner.next().equals("yes")) {
            System.out.println("Engine is on");
            currentSpeed();
        } else if (scanner.next().equals("no")) {
            System.out.println("Engine is off. Get list of car characteristics: ");
            setupCarInfo();
        } else {
            System.out.println("Please choose yes or no.");
        }
    }

    /**
     * This method describes car power and car volume.
     *
     * @param power
     * @param volume
     */
    public void setupEngine(double power, double volume) {
        System.out.println("Power: " + power + "\n" + "Volume: " + volume);
    }

    /**
     * This method describes the state of car air condition. Shows temperature and it's availability.
     *
     * @param temperature
     * @param airState
     */
    public void setupAirCondition(double temperature, boolean airState) {
        if (airState) {
            System.out.println("Air condition is on");
        } else {
            System.out.println("Air condition is off");
        }
        System.out.println("Current temperature: " + temperature);
    }

    /**
     * This method describes car main characteristics if user chooses not to start a car and gets air condition characteristics.
     */
    public void setupCarInfo() {
        System.out.println("Car brand is: " + brand + "\n" + "Car model is: " + model + "\n" + "Year of production is: " + productionYear);
        setupAirCondition(23, true);
    }

    /**
     * The method asks user about the current speed for further fuel consumption calculation.
     */
    private void currentSpeed() {
        System.out.println("What is your current speed?");
        Scanner scanner = new Scanner(System.in);
        int speed = scanner.nextInt();
        System.out.println("I am driving at " + speed);
        fuelConsumption();
    }

    /**
     * This method describes calculation of the fuel consumption of the car.
     */
    public void fuelConsumption() {
        System.out.println("What distance have you drawn through?");
        Scanner scanner = new Scanner(System.in);
        int distance = scanner.nextInt();
        System.out.println("My fuel consumption is: " + volume / distance * 100);
        setupEngine(5.6, 40);
    }
}

