package Assignments.Snacks;

public class Chips extends Snacks {
    protected double sodium;
    
    public Chips(double calories, double sugar, String name, int sodium){
        super(calories, sugar, name);
        this.sodium = sodium;
    }
    public double getSodium(){
        return this.sodium;
    }
    public String moreCalories(Chips chip){
        if (this.calories > chip.getCalories()){
            return this.name;
        }
        else if (this.calories < chip.getCalories()){
            return chip.getName();
        }
        else{
            return "they are equal in calories";
        }

    }
    public String moreSalt(Chips chip){
        if (this.sodium > chip.getSodium()){
            return this.name;
        }
        else if (this.sodium < chip.getSodium()){
            return chip.getName();
        }
        else{
            return "they are equal in sugar content";
        }
        
    }
    public double litersOfWaterRecommended(){
        return this.sodium/2000;
    }
    
}
