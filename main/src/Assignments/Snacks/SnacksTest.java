package Assignments.Snacks;

public class SnacksTest {
    public static void main(String[] args) {
        // Run all tests
        testCookiesConstructor();
        testTotalCalories();
        testTotalSugar();
        testIsOverRecommendedValue();
        testMoreCalories();
        testMoreSugar();
        testChipsConstructor();
        testMoreCaloriesForChips();
        testMoreSalt();
        testLitersOfWaterRecommended();
        testPercentageSugar();
    }

    public static void testCookiesConstructor() {
        Cookies cookie = new Cookies();
        System.out.println(cookie != null ? "Cookies Constructor test passed." : "Cookies Constructor test failed.");
    }

    public static void testTotalCalories() {
        Cookies cookie = new Cookies(200.0, 15.0, "Cookie", 3);
        System.out.println(cookie.totalCalories() == 600.0 ? "Total Calories test passed." : "Total Calories test failed.");
    }

    public static void testTotalSugar() {
        Cookies cookie = new Cookies(200.0, 15.0, "Cookie", 3);
        System.out.println(cookie.totalSugar() == 45.0 ? "Total Sugar test passed." : "Total Sugar test failed.");
    }

    public static void testIsOverRecommendedValue() {
        Cookies cookie = new Cookies(200.0, 18.0, "Cookie", 3);
        System.out.println(cookie.isOverRecommendedValue() ? "Is Over Recommended Value test passed." : "Is Over Recommended Value test failed.");
    }

    public static void testMoreCalories() {
        Cookies cookie1 = new Cookies(200.0, 15.0, "Cookie 1", 3);
        Cookies cookie2 = new Cookies(150.0, 10.0, "Cookie 2", 2);
        System.out.println(cookie1.moreCalories(cookie2).equals("Cookie 1") ? "More Calories test passed." : "More Calories test failed.");
    }

    public static void testMoreSugar() {
        Cookies cookie1 = new Cookies(200.0, 15.0, "Cookie 1", 3);
        Cookies cookie2 = new Cookies(150.0, 10.0, "Cookie 2", 2);
        System.out.println(cookie1.moreSugar(cookie2).equals("Cookie 1") ? "More Sugar test passed." : "More Sugar test failed.");
    }

    public static void testChipsConstructor() {
        Chips chip = new Chips(250.0, 5.0, "Chip", 500);
        System.out.println(chip != null ? "Chips Constructor test passed." : "Chips Constructor test failed.");
    }

    public static void testMoreCaloriesForChips() {
        Chips chip1 = new Chips(300.0, 10.0, "Chip 1", 600);
        Chips chip2 = new Chips(250.0, 5.0, "Chip 2", 500);
        System.out.println(chip1.moreCalories(chip2).equals("Chip 1") ? "More Calories for Chips test passed." : "More Calories for Chips test failed.");
    }

    public static void testMoreSalt() {
        Chips chip1 = new Chips(300.0, 10.0, "Chip 1", 600);
        Chips chip2 = new Chips(250.0, 5.0, "Chip 2", 500);
        System.out.println(chip1.moreSalt(chip2).equals("Chip 1") ? "More Salt test passed." : "More Salt test failed.");
    }    

    public static void testLitersOfWaterRecommended() {
        Chips chip = new Chips(250.0, 5.0, "Chip", 500);
        System.out.println(chip.litersOfWaterRecommended() == 0.25 ? "Liters of Water Recommended test passed." : "Liters of Water Recommended test failed.");
    }

    public static void testPercentageSugar() {
        Snacks snack = new Snacks(200.0, 10.0, "Snack");
        System.out.println(snack.percentageSugar() == 5.0 ? "Percentage Sugar test passed." : "Percentage Sugar test failed.");
    }
}
