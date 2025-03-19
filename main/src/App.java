import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input Decimal: ");
        int userInput = (int) keyboard.nextFloat();
        System.out.println("Number is " + userInput);
        keyboard.close();
    }
}
