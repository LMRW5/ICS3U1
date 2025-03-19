import java.util.*;
public class cosinelaw {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Side A");
        double side1 = input.nextDouble();
        System.out.println("Side B");
        double side2 = input.nextDouble();
        System.out.println("angle C");
        double angleC = input.nextDouble();
        double c = Math.sqrt(side1*side1+side2*side2 - 2*side1*side2*Math.cos(Math.toRadians(angleC)));
        System.out.println("Side C is: " + c);
        input.close();
    }
}
