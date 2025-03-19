package Assignments;

import java.util.Scanner;

public class NewtonsMethod {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();

        while (true) {
            System.out.println("Guess: ");
            double guess = input.nextDouble();
            double newtons = -99999999999.9999;
            
            while (true) {
                double function1 = 6 * Math.pow(guess, 4) - 13 * Math.pow(guess, 3) - 18 * guess * guess + 7 * guess
                        + 6;
                double derivative = 24 * Math.pow(guess, 3) - 39 * Math.pow(guess, 2) - 36 * guess + 7;
                newtons = guess - (function1 / derivative);
                System.out.println("Approximation: " + newtons);
                
                if (Math.abs(guess - newtons) <= 0.0000000001) {
                    System.out.println("Your root is " + newtons);
                    break;
                }
                guess = newtons;

            }

            while (true) {
                System.out.println("Do you want to go again (Y/N)");
                String uval = input.next();

                if (uval.charAt(0) == 'N' | uval.charAt(0) == 'n') {
                    input.close();
                    return;
                } else if (uval.charAt(0) == 'Y' | uval.charAt(0) == 'y') {
                    break;
                } else {
                    continue;
                }
            }
        }
    }
}
