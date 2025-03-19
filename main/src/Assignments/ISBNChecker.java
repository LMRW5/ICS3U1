package Assignments;

import java.util.Scanner;

public class ISBNChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String isbn = input.next();
        int sum = 0;
        input.close();
        if (isbn.length() != 13){
            System.err.println("Not valid ISBN must be 13 chars");
            System.exit(1);
        }
        for (int i = 0; i < isbn.length(); i++){
            int foo = Integer.parseInt(Character.toString(isbn.charAt(i)));

            if (i%2 == 1){
                sum+= foo;
            }
            else{
                sum+= foo*3;
            }
        }
        if (sum%10 != 0){
            System.out.println("Not valid");
            System.exit(0);
        }
        else{
            System.out.println("valid");
            System.exit(0);
        }
    }
}
