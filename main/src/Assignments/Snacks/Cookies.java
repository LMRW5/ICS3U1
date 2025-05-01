package Assignments.Snacks;

public class Cookies extends Snacks {
    protected int amount;
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
     * returns the amount of cookies
     * @return
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
     * returns the total amount of calories in the cookies eaten
     * @return
     */
    public double totalCalories(){
        return this.calories*amount;
    }
    /**
     * returns the total amount of sugar in the cookies eaten
     * @return
     */
    public double totalSugar(){
        return this.sugar*amount;
    }
    /**
     * takes in another cookie and compares the calories of the two cookies, returning the name of the cookie with more calories
     * @param cookie
     * @return
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
     * takes in another cookie and compares the sugar of the two cookies, returning the name of the cookie with more sugar
     * @param cookie
     * @return
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
     * returns true if the cookies eaten are over the recommended amount of sugar (50 grams) 
     * @return
     */
    public boolean isOverRecommendedValue(){
        return this.sugar*amount > 50;
    }
}
