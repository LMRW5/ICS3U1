import java.util.*;

public class PIApproximation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ans = ' ';
        while (!(ans =='N')){
        System.out.println("N value:");
        int n = input.nextInt();
        double sum = 0;
        for (int i = 0; i < n; i++){
            sum+= Math.pow(-1,i)/(2*i+1);
        }
        double calculation = 4*sum;
        System.out.println(calculation);
        System.out.println("Would you like to try again (Y/N)");
        ans = input.next().charAt(0);
        }
        input.close();
    
    }

}
