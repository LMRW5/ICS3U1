import java.util.*;

public class QuadraticFormula {
    public static float inputs(char value) {
        Scanner input = new Scanner(System.in);
        System.out.println("input " + value);
        float tmp = input.nextFloat();
        input.close();
        return tmp;
    }

    public static void main(String[] args) {

        float a = inputs('a');
        float b = inputs('b');
        float c = inputs('c');

        if ((Math.pow(b, 2) - (4 * a * c)) < 0) {
            System.err.println("Imaginary roots");
        } else if ((Math.pow(b, 2) - (4 * a * c)) == 0) {
            System.out.println("both roots are: "
                    + String.format("%.3g%n", (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a)));
        } else {

            System.out.println(
                    "pos root is: " + String.format("%.3g%n", (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a)));
            System.out.println("negative root is: "
                    + String.format("%.3g%n", (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a)));
        }

    }
}
