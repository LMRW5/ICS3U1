import java.util.*;

public class NANDGATE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Boolean A");
        boolean A = input.nextBoolean();
        System.out.println("Boolean B");
        boolean B = input.nextBoolean();
        System.out.println(!(A && B));
        input.close();
    }
}
