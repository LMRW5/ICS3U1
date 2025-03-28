package Assignments;

import java.util.Scanner;

public class PowerRule {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter coefficinets:");
        String[] coeffienctsArray = input.nextLine().split(" ");
        System.out.println("Enter degrees: ");
        String[] degreesArray = input.nextLine().split(" ");
        input.close();
        String[] firstDerrivative = new String[coeffienctsArray.length];
        String[] secondDerrivative = new String[coeffienctsArray.length];

        for (int i = 0; i < degreesArray.length; i++) {
            double coeffienct = Double.parseDouble(coeffienctsArray[i]);
            int power = Integer.parseInt(degreesArray[i]);
            coeffienct *= power;
            power -= 1;
            String curr = "";
            if (power == 0) {
                if (coeffienct > 0 & i != 0) {
                    curr += "+";
                }
                curr += Double.toString(coeffienct);
            } else if (power > 0) {
                if (coeffienct > 0 & i != 0) {
                    curr += "+";
                }
                curr += coeffienct + "x^" + power;
            }
            firstDerrivative[i] = curr;

        }
        for (int j = 0; j < secondDerrivative.length; j++) {
            String string = firstDerrivative[j];
            String curr = "";
            if (string.contains("x")) {
                double coeffienct = Double.parseDouble(string.substring(0, string.indexOf("x")));
                int power = Integer.parseInt(string.substring(string.indexOf("^") + 1));
                coeffienct *= power;
                power -= 1;
                if (power == 0) {
                    if (coeffienct > 0 & j != 0) {
                        curr += "+";
                    }
                    curr += Double.toString(coeffienct);
                } else if (power > 0) {
                    if (coeffienct > 0 & j != 0) {
                        curr += "+";
                    }
                    curr += coeffienct + "x^" + power;
                }

            }
            secondDerrivative[j] = curr;

        }
        System.out.println("First Derivative");
        System.out.print("f'(x)=");
        for (String string : firstDerrivative) {
            System.out.print(string + " ");
        }
        System.out.println();
        System.out.println("Second Derivative");
        System.out.print("f''(x)=");
        for (String string : secondDerrivative) {
            System.out.print(string + " ");
        }
    }

}
