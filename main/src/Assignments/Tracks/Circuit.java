package Assignments.Tracks;

public class Circuit extends Tracks {
    protected int turns;
    public Circuit(String name, String country, String year, int turns){
        super(name, country, turns);
        this.turns = turns;
    }
    public int getTurns(){
        return this.turns;
    }
    public void displayCircuit(){
        this.displayTrack();
        System.out.printf("It is a high speed circuit with %d turns\n", this.turns);
    }
    
}
