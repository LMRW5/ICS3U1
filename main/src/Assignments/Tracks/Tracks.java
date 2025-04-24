package Assignments.Tracks;

public class Tracks {
    protected String name;
    protected String country;
    protected int year;
    
    public Tracks(String name, String country, int year){
        this.name = name;
        this.country = country;
        this.year = year;
    }
    public String getName(){
        return this.name;
    }
    public String getCountry(){
        return this.country;
    }
    public int getYear(){
        return this.year;
    }
    public void displayTrack(){
        System.out.printf("%s is a track in %s and was introduced in %d\n", this.name, this.country, this.year);
    }
    public int ageOfTrack(){
        return 2025-this.year;
    }
    public void displayYearsInCountry(){
        System.out.printf("%s has been racing in %s for %d years!", this.name, this.country, ageOfTrack());
    }
}
