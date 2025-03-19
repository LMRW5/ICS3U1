import java.util.*;

public class sinlaw {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is format AAS or ASS: ");
        String format = input.nextLine();
        if (format.equalsIgnoreCase("AAS")) {
            System.out.println("Angle A");
            double angleA = input.nextDouble();
            System.out.println("Angle B");
            double angleB = input.nextDouble();
            System.out.println("Side a");
            double SideA = input.nextDouble();
            double result = (SideA * Math.sin(angleB)) / (Math.sin(angleA));
            System.out.println(result);

        } 
        else if (format.equalsIgnoreCase("ASS")) {
            System.out.println("Angle A");
            double angleA = input.nextDouble();
            System.out.println("Side A");
            double SideA = input.nextDouble();
            System.out.println("Side B");
            double SideB = input.nextDouble();
            double result = 1 / (Math.sin(Math.toRadians((Math.sin(Math.toRadians(angleA))) * SideB / SideA)));
            System.out.println(result);
        }
        input.close();

    }
}
