package Assignments.line;

public class Point {
    private double x;
    private double y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Point(){
        this(0.0,0.0);
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public void displayCoordinate(){
        System.out.printf("X coord is %d\nYcoord is %d\n",this.x,this.y);
    }
    public double distance(Point point){
        return Math.sqrt(Math.pow(this.x - point.getX(),2) + Math.pow(this.y - point.getY(),2));
    }
    public Point difference(Point point){
        
    }
}
