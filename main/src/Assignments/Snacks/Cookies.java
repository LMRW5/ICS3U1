package Assignments.Snacks;

public class Cookies extends Snacks {
    protected int amount;
    public Cookies(double calories, double sugar, String name, int amount){
        super(calories, sugar, name);
        this.amount = amount;
    }
    public Cookies(){
        this(148.0,9.9,"Chocolate Chip Cookie",1);
    }
    
    public int getAmount(){
        return this.amount;
    }
    public void displayCookie(){
        System.out.printf("You are eating %s %d times", this.name, this.amount);
    }
    public double totalCalories(){
        return this.calories*amount;
    }
    public double totalSugar(){
        return this.sugar*amount;
    }
    public String moreCalories(Cookies cookie){
        if (this.calories > cookie.getCalories()){
            return this.name;
        }
        else if (this.calories < cookie.getCalories()){
            return cookie.getName();
        }
        else{
            return "they are equal in calories";
        }

    }
    public String moreSugar(Cookies cookie){
        if (this.sugar > cookie.getSugar()){
            return this.name;
        }
        else if (this.sugar < cookie.getSugar()){
            return cookie.getName();
        }
        else{
            return "they are equal in sugar content";
        }
        
    }
    public boolean diabetes(){
        if(this.sugar*amount > 50){
            return true;

        }
        else return false;
    }
}
