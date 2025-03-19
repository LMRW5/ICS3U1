import java.util.Scanner;


public class polynomialFunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input coefficients");
        String coefficients = input.nextLine();
        String[] coefficientsArray = coefficients.split(" ");
        System.out.println("Input degrees");
        String degrees = input.nextLine();
        String[] degreesArray = degrees.split(" ");
        System.out.println("Input xval");
        int xval = input.nextInt();
        String[] funciton = new String[coefficientsArray.length];
        for (int i =0; i<coefficientsArray.length;i++){
            funciton[i] = coefficientsArray[i] + "x^" + degreesArray[i];
        }
        System.out.print("your polynomial is");
        for (int i = 0; i < funciton.length; i++) {
            System.out.print(funciton[i] + "+");
        }
        System.out.println();
        System.out.print("your polynomial at x is: ");
        double sum = 0;
        for (int i = 0; i < funciton.length; i++) {
            double co = Double.parseDouble(coefficientsArray[i]);
            double powah = Double.parseDouble(degreesArray[i]);
            sum += Math.pow(xval,powah)*co;
        }
        System.out.println(sum);
        input.close();
    }
}
