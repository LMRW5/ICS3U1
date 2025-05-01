package Assignments.Snacks;

public class Chips extends Snacks {
    protected double sodium;
    
    public Chips(double calories, double sugar, String name, int sodium){
        super(calories, sugar, name);
        this.sodium = sodium;
    }
    /**
     * returns amount of sodium in the chips
     * @return
     */
    public double getSodium(){
        return this.sodium;
    }
    /**
     * takes a chip as a paramater, compares the calories of the two chips, returning the name of the chip with more calories
     * @param chip
     * @return
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
     * takes a chip as a paramater, compares the sodium of the two chips, returning the name of the chip with more sodium
     * @param chip
     * @return
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
     * returns amount of liters of water recommended to drink after eating the chips
     * 1 liter of water is recommended for every 2000mg of sodium consumed
     * @return
     */
    public double litersOfWaterRecommended(){
        return this.sodium/2000;
    }
    
}
