package Assignments.Enums;

public class Main {
    public static void main(String[] args) {

        // Select two drivers for comparison
        CarDrivers driver1 = CarDrivers.SCHUMACHER;
        CarDrivers driver2 = CarDrivers.HAMILTON;
        //spaces
        System.out.println();
        // Display driver information
        System.out.println("=== Driver 1 Info ===");
        driver1.displayDriver();

        System.out.println("\n=== Driver 2 Info ===");
        driver2.displayDriver();

        // Test get methods
        System.out.println("\n=== Getters Test ===");
        System.out.println(driver1 + " titles: " + driver1.getTitles());
        System.out.println(driver1 + " team: " + driver1.getTeam());
        System.out.println(driver1 + " race starts: " + driver1.getRaceStarts());
        System.out.println(driver1 + " race wins: " + driver1.getRaceWins());

        // Compare titles
        System.out.println("\n=== Title Comparison ===");
        driver1.moreTitles(driver2);
        driver2.moreTitles(driver1);

        // Compare win rates
        System.out.println("\n=== Win Rate Comparison ===");
        driver1.higherWinRate(driver2);
        driver2.higherWinRate(driver1);

        // Print win rates and wins-to-titles ratios
        System.out.println("\n=== Win Rate and Wins-to-Titles Ratio ===");
        System.out.printf("%s winrate: %.2f\n", driver1, driver1.winrate());
        System.out.printf("%s winrate: %.2f\n", driver2, driver2.winrate());
        System.out.printf("%s wins-to-titles ratio: %.2f\n", driver1, driver1.winsToTitles());
        System.out.printf("%s wins-to-titles ratio: %.2f\n", driver2, driver2.winsToTitles());

        // Optional: Loop through all drivers and display info
        System.out.println("\n=== All Drivers Summary ===");
        for (CarDrivers d : CarDrivers.values()) {
            System.out.println("\nDriver: " + d);
            d.displayDriver();
        }
    }
}
