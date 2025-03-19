package Assignments;

import java.util.Scanner;

public class BooleanTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Bool A");
        boolean a = input.nextBoolean();
        System.out.println("Bool B");
        boolean b = input.nextBoolean();
        System.out.println("Bool C");
        boolean c = input.nextBoolean();
        System.out.println("Bool D");
        boolean d = input.nextBoolean();
        input.close();
        System.out.println("output is: " + (b && !d || !b && !c && d || !a && !b && !c || a && c && !d));
    }
}