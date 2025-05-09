package Assignments.Snacks;

public class Chips extends Snacks {
    protected double sodium;
    
    public Chips(double calories, double sugar, String name, int sodium){
        super(calories, sugar, name);
        this.sodium = sodium;
    }
    /**
     * @return amount of sodium in the chips
     * 
     */
    public double getSodium(){
        return this.sodium;
    }
    /**
     * takes a chip as a paramater, compares the calories of the two chips
     * @param chip
     * @return the name of the chip with more calories
     */
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
    /**
     * takes a chip as a paramater, compares the sodium of the two chips
     * @param chip
     * @return the name of the chip with more sodium
     */
    public String moreSalt(Chips chip){
        if (this.sodium > chip.getSodium()){
            return this.name;
        }
        else if (this.sodium < chip.getSodium()){
            return chip.getName();
        }
        else{
            return "they are equal in sodium content";
        }
        
    } 
    /** 
     * 1 liter of water is recommended for every 2000mg of sodium consumed
     * @return amount of liters of water recommended to drink after eating the chips
     */
    public double litersOfWaterRecommended(){
        return this.sodium/2000;
    }
    
}
