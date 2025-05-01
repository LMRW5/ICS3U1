package Assignments.Snacks;

public class Snacks {

    protected double calories;
    protected double sugar;
    protected String name;

    public Snacks(double calories, double sugar, String name){
        this.calories = calories;
        this.sugar = sugar;
        this.name = name;
    }
    /**
     * constructor that defaults name to "unnamed"
     * @param calories
     * @param sugar
     */
    public Snacks(double calories, double sugar){
        this(calories, sugar, "unnamed");
    }
    /**
     * default constructor for the snacks class, sets all values to 0.0 and name to "unnamed"
     */
    public Snacks(){
        this(0.0,0.0,"unnamed");
    }
    /**
     * returns the amount of calories in the snack
     * @return
     */
    public double getCalories(){
        return this.calories;
    }
    /**
     * returns the amount of sugar in the snack
     * @return
     */

    public double getSugar(){
        return this.sugar;
    }
    /**
     * returns the name of the snack
     * @return
     */
    public String getName(){
        return this.name;
    }
    /**
     * returns the percentage of sugar in the snack
     * @return
     */
    public double percentageSugar(){
        return (this.sugar/this.calories) * 100;
    }
    /**
     * prints out if the snack is over or under the recommended amount of sugar, if it is under it shows how much more sugar you can consume
     */
    // 36 grams of sugar is the recommended amount of sugar to consume in a day
    public void sugarRequirements(){
        if (this.sugar < 36){
            System.out.printf("after eating this, it is recommended to only consume %d more grams of sugar\n", 36-this.sugar);
        }
        else if (this.sugar > 36){
            System.out.println("There is too much sugar in this snack");
        }
        else{
            System.out.println("this is just enough sugar to consume today");
        }
    }
    /**
     * prints out if the snack is over or under the recommended amount of calories, if it is under it shows how much more calories you can consume
     */
    // 3000 calories is the recommended amount of calories to consume in a day
    
    public void calorieRequirements(){
        if (this.calories < 3000){
            System.out.printf("after eating this, it is recommended to only eat %d more calories\n", 3000-this.calories);
        }
        else if (this.calories > 3000){
            System.out.println("There is too many calories in this snack");
        }
        else{
            System.out.println("this is just enough calories to consume today");
        }
    }
}
