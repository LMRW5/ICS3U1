package Assignments.line;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0.0, 0.0);
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void displayCoordinate() {
        System.out.printf("X coord is %f \nYcoord is %f\n", this.x, this.y);
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow(this.x - point.getX(), 2) + Math.pow(this.y - point.getY(), 2));
    }

    public Point difference(Point point) {
        double newx = this.x - point.getX();
        double newy = this.y - point.getY();
        return new Point(newx, newy);
    }

    public double slope(Point point) {
        return (point.getY() - this.y) / (point.getX() - this.x);
    }

    public double yIntercept(Point point) {
        double m = slope(point);
        return this.y - m * this.x;
    }

    public void linearEquation(Point point) {
        double m = slope(point);
        double b = yIntercept(point);
        if (b == 0) {
            System.out.printf("y = %fx", m);
        } else {
            System.out.printf("y = %fx + %f", m, b);
        }
    }

    public Point midpoint(Point point) {
        double x = (this.x + point.getX()) / 2;
        double y = (this.y - point.getY()) / 2;
        return new Point(x, y);
    }

    public Point sum(Point point) {
        double x = this.x + point.getX();
        double y = this.y + point.getY();
        return new Point(x, y);
    }

}
