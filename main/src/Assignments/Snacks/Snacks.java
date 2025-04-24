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
    public Snacks(){
        this(0.0,0.0,"unnamed");
    }
    public double getCalories(){
        return this.calories;
    }
    public double getSugar(){
        return this.sugar;
    }
    public String getName(){
        return this.name;
    }
    public double percentageSugar(){
        return (this.sugar/this.calories) * 100;
    }
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
