package Assignments.Snacks;
/**
 * Cookies class that extends the Snacks class
 * This class contains the basic information about a cookie, such as calories, sugar, name, and amount.
 * @author Ryan
 * @version 1.0
 */
public class Cookies extends Snacks {
    protected int amount;
    /**
     * constructor that takes in the calories, sugar, name, and amount of the cookies
     * calls the super constructor to set the calories, sugar, and name
     * @param calories 
     * @param sugar
     * @param name
     * @param amount
     */
    public Cookies(double calories, double sugar, String name, int amount){
        super(calories, sugar, name);
        this.amount = amount;
    }
    /**
     * default constructor for the cookies class, sets calories to 148, sugar to 9.9 name to "Chocolate Chip Cookie" and amount to 1
     */
    public Cookies(){
        this(148.0,9.9,"Chocolate Chip Cookie",1);
    }
    /**
     * 
     * @return the amount of cookies
     */
    public int getAmount(){
        return this.amount;
    }
    /**
     * displaces the name of the cookie and amount of cookies eaten
     */
    public void displayCookie(){
        System.out.printf("You are eating %s %d times", this.name, this.amount);
    }
    /**
     * @return the total amount of calories in the cookies eaten
     */
    public double totalCalories(){
        return this.calories*amount;
    }
    /**
     * @return the total amount of sugar in the cookies eaten
     */
    public double totalSugar(){
        return this.sugar*amount;
    }
    /**
     * takes in another cookie and compares the calories of the two cookies
     * @param cookie
     * @return the name of the cookie with more calories
     */
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
    /**
     * takes in another cookie and compares the sugar of the two cookies, 
     * @return the name of the cookie with more sugar
     */
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
    /**
     * @return true if the cookies eaten are over the recommended amount of sugar (50 grams)
     */
    public boolean isOverRecommendedValue(){
        return this.sugar*amount > 50;
    }
}
