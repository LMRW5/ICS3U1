package bop;

public class pop {
    public static void main(String[] args) {
        PopMachine machine = new PopMachine(10);
        machine.coinSlot(10);
        machine.popButton();
        System.out.println("here is your money back: " + machine.coinReturn());
    }    
}
