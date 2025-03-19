import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[10]; 
        // game loop
        while (true) {
            System.out.println("1,2,3 or 4");
            String mode = input.nextLine();
            if (mode.equals("1")){
                for (int i = 0; i < 10; i++){
                    String plus = input.nextLine();
                    arr[i] = plus;
                }
            }
            else if (mode.equals("2")){
                for (int i = 0; i < arr.length; i++){
                    System.out.println(arr[i]);
                }
            }
            else if (mode.equals("3")){
                int access = input.nextInt();
                System.out.println(arr[access]);
            }
            else if (mode.equals("4")){
                break;
            }
            else{
                System.err.println("Please enter a value from 1-4");
            }
        }
        input.close();
    }
}
