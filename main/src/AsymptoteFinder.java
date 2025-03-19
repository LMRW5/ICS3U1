import java.util.HashMap;
import java.util.Scanner;

public class AsymptoteFinder { //class = Asymptote Finder 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, String> mapper = new HashMap<Integer, String>();
        // keys {1: linerar,}
        mapper.put(1, "Linear");
        mapper.put(2, "Quadratic");
        mapper.put(3, "Cubic");
        mapper.put(4, "Quartic");
        mapper.put(5, "Quintic");
        mapper.put(6, "Sextic");
        mapper.put(7, "Septic");
        mapper.put(8, "Octic");
        mapper.put(9, "Nonic");
        mapper.put(10, "Decic");

        System.out.print("M: ");
        int m = input.nextInt();
        System.out.print("N: ");
        int n = input.nextInt();
        input.close(); // input is closed
        if (m == n) {
            System.out.println("Horizontal Asymptote");
        } else if (m < n) {
            System.out.println("Asymptote is x axis");
        } else {
            int difference = m - n;
            System.out.println("difference is: " + mapper.get(difference));
        }
    }
}
