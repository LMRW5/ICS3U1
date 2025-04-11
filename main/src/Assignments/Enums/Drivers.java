package Assignments.Enums;

public class Drivers {

    public enum CarDrivers {

        SCHUMACHER(7, "Ferrari"),
        VERSTAPPEN(4, "Redbull"),
        ALONSO(2, "Renault"),
        HAMILTON(7, "Mercedes"),
        ROSBERG(1, "Mercedes"),
        SENNA(3, "Mclaren"),
        LAUDA(3, "Ferrari"),
        HUNT(1, "Mclaren"),
        FANGIO(5, "Ferrari"),
        SAINZ(0, "Ferrari"),
        VETTEL(4, "Redbull");

        private int titles;
        private String team;

        CarDrivers(int titles, String team) {
            this.titles = titles;
            this.team = team;
        }

        public int getTitles() {
            return this.titles;
        }

        public String getTeam() {
            return this.team;
        }

        public void displayDriver() {
            System.out.printf("This driver has %d titles and scored them with %s\n", this.titles, this.team);
        }

        public void moreTitles(CarDrivers driver) {
            if (driver.getTitles() > this.titles) {
                System.out.printf("%s has more titles\n", driver);
            } else if (driver.getTitles() < this.titles) {
                System.out.printf("%s has less titles\n", driver);
            } else {
                System.out.println("They have the same amount of titles");
            }
        }

    }

}
