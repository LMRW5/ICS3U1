package Assignments.Enums;

public enum CarDrivers {

    SCHUMACHER(7, "Ferrari", 306, 91),
    VERSTAPPEN(4, "Redbull", 213, 64),
    ALONSO(2, "Renault", 405, 32),
    HAMILTON(7, "Mercedes", 360, 105),
    ROSBERG(1, "Mercedes", 206, 23),
    SENNA(3, "Mclaren", 161, 41),
    LAUDA(3, "Ferrari", 171, 25),
    HUNT(1, "Mclaren", 92, 10),
    FANGIO(5, "Ferrari", 52, 24),
    SAINZ(0, "Ferrari", 210, 4),
    VETTEL(4, "Redbull", 299, 53);

    private int titles;
    private String team;
    private int raceStarts;
    private int raceWins;

    CarDrivers(int titles, String team, int raceStarts, int raceWins) {
        this.titles = titles;
        this.team = team;
        this.raceStarts = raceStarts;
        this.raceWins = raceWins;
    }

    public int getTitles() {
        return titles;
    }

    public String getTeam() {
        return team;
    }

    public int getRaceStarts() {
        return raceStarts;
    }

    public int getRaceWins() {
        return raceWins;
    }

    public void displayDriver() {
        System.out.printf(
                "%s has %d titles and scored them with %s\nHe has %d race wins and %d race starts\n",
                this, titles, team, raceWins, raceStarts);
    }
    /**
     * Compares the number of titles between two drivers
     *
     * @param driver the other driver to compare with
     */
    public void moreTitles(CarDrivers driver) {
        if (driver.getTitles() > titles) {
            System.out.printf("%s has more titles\n", driver);
        } else if (driver.getTitles() < titles) {
            System.out.printf("%s has less titles\n", driver);
        } else {
            System.out.printf("%s and %s have the same amount of titles\n", this, driver);
        }
    }

    public void higherWinRate(CarDrivers driver) {
        if (driver.winrate() > this.winrate()) {
            System.out.printf("%s has a higher win rate than %s\n", driver, this);
        } else if (driver.winrate() < this.winrate()) {
            System.out.printf("%s has a higher win rate than %s\n", this, driver);
        } else {
            System.out.printf("%s and %s have the same winrate\n", this, driver);
        }
    }

    public double winrate() {
        return (double) raceWins / raceStarts;
    }

    public double winsToTitles() {
        return (double) titles / raceWins;
    }

    public boolean isWorldChampion() {
        return titles >= 1;
    }
}
