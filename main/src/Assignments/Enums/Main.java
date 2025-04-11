package Assignments.Enums;

import Assignments.Enums.Drivers.CarDrivers;

public class Main {
    public static void main(String[] args) {
        for (CarDrivers driver : CarDrivers.values()){
            System.out.println(driver);
            driver.displayDriver();
        }
    }
}
