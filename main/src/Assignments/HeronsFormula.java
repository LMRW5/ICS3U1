package Assignments;

import java.util.*;

public class HeronsFormula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input A:");
        double a = input.nextDouble();
        System.out.println("Input B:");
        double b = input.nextDouble();
        System.out.println("Input C:");
        double c = input.nextDouble();

        double calculation = Math.sqrt(4 * a * a * b * b - Math.pow(a * a + b * b - c * c, 2)) / 4;
        System.out.println("calculation is " + calculation);
        input.close();
    }
}
