import java.util.*;

public class Phonebook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        HashMap <String, Long> x = new HashMap<String, Long>();
        System.out.print("How many Iteratoins: ");
        int iterations = input.nextInt();
        for (int i = 0; i < iterations; i++){
            System.out.print("What is Name: ");
            String y = input.nextLine();
            System.out.println();
            System.out.print("What is Phone Number: ");
            long z = input.nextLong();

            x.put(y, z);
        }
        System.out.println(x);
        input.close();


    }
}
