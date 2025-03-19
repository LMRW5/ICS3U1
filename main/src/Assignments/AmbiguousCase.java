package Assignments;

import java.util.*;

public class AmbiguousCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Input angle A");
        double angleA = input.nextDouble();
        System.out.println("Input side A");
        double sideA = input.nextDouble();
        System.out.println("Input side B");
        double sideB = input.nextDouble();
        input.close();

        double value = Math.sin(Math.toRadians(angleA)) * sideB;
        double h = Math.round(value * 100.0) / 100.0;
        
        if (angleA > 90) {
            // obtuse triangle
            if (sideA < sideB | sideA == h) {
                System.out.println("No Triangles");
            } else if (sideA > sideB) {
                System.out.println("One Triangle");
            }
        } else if (angleA < 90) {
            // Acute triangle
            if (sideA < h) {
                System.out.println("No triangle");
            } else if (sideA == h) {
                System.out.println("Right triangle");
            } else if (sideA > sideB) {
                System.out.println("One Triangle");
            } else if (h < sideA & sideA < sideB) {
                System.out.println("Two triangles (ambiguous case)");
            }
        } else {
            System.out.println("Right Triangle");
        }
    }
}
