package Assignments;

import java.util.*;

public class polynomialEvaluator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Polynomial: ");
        String str = input.nextLine();
        str = str.replace("f(x)=", "");
        StringTokenizer token = new StringTokenizer(str, " ");
        System.out.println("what is f(x)");
        double xval = input.nextDouble();
        input.close();
        double sum = 0.0;
        while (token.hasMoreTokens()) {
            String curr = token.nextToken();
            if (!curr.contains("x")) {
                sum += Double.parseDouble(curr);
                continue;
            }
            double preX = Double.parseDouble(curr.substring(0, curr.indexOf("x")));
            String power = "1";
            try {
                if (!curr.contains("^")) {
                    throw new Exception();
                }
                power = curr.substring(curr.indexOf("^") + 1);
            } catch (Exception err) {
                power = "1";
            }

            sum += Math.pow(xval, Double.parseDouble(power)) * preX;
        }
        System.out.println("f(x) is " + sum);
    }

}
