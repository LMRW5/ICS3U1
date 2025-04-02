package bop;

public class PopMachine {

    private int numberOfPop;
    private double amountOfMoney;
    private double priceOfPop;
    private double profit = 0;

    public PopMachine(int numberOfPop, double amountOfMoney, double priceOfPop) {

        this.numberOfPop = numberOfPop;
        this.amountOfMoney = amountOfMoney;
        this.priceOfPop = priceOfPop;

    }

    public PopMachine(int numberOfPop) {

        this(numberOfPop, 0.0, 1.75);

    }

    public void coinSlot(double money) {
        amountOfMoney += money;
    }

    public void popButton() {
        if (amountOfMoney < priceOfPop){
            System.out.println("Not enough money");
            return;
        }
        if (numberOfPop >= 1) {
            amountOfMoney -= priceOfPop;
            numberOfPop--;
            profit += priceOfPop;
            System.out.printf("Pop remaining = %d\n", numberOfPop);
        } else {
        System.out.println("Sold out");
        return;    
        }
    
    }

    public double coinReturn() {
        amountOfMoney -= priceOfPop;
        return amountOfMoney;

    }
    public double returnprofit(){
        profit = 0;
        return profit;
    }
}
