import java.util.*;

public class Booleantest {
    public static boolean OR(boolean a, boolean b) {
        return a || b;
    }

    public static boolean AND(boolean a, boolean b) {
        return a && b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scans Text
        boolean a = input.nextBoolean();
        boolean b = input.nextBoolean();
        boolean c = input.nextBoolean();
        boolean d = input.nextBoolean();

        boolean andGate1 = AND(a, b);
        boolean andGate2 = AND(c, d);
        boolean andGate3 = AND(c, a);
        boolean andGate4 = AND(a, d);
        boolean andGate5 = AND(d, b);
        boolean andGate6 = AND(b, c);

        boolean orGate1 = OR(andGate1, andGate2);
        boolean orGate2 = OR(andGate3, andGate4);
        boolean orGate3 = OR(andGate5, andGate6);

        boolean orGate4 = OR(orGate1, orGate2);
        boolean orGate5 = OR(orGate2, orGate3);

        boolean result = OR(orGate4, orGate5);
        System.out.println(result);
        input.close();

        System.out.println(OR(OR(OR(AND(a, b), AND(c, d)), OR(AND(c, a), AND(a, d))),
                OR(OR(AND(c, a), AND(a, d)), OR(AND(d, b), AND(b, c)))));

    }
}
