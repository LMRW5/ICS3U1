package Assignments;

import java.util.Scanner;

public class PowerRule {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] coeffienctsArray = input.nextLine().split(" ");
        String[] degreesArray = input.nextLine().split(" ");
        input.close();
        String function = "";
        for (int i = 0; i < degreesArray.length; i++) {
            function += coeffienctsArray[i] + "x^" + degreesArray[i];
        }
        System.out.println(function);


    }
}