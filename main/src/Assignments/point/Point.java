package Assignments.point;

public class Point {

    private final double x;
    private final double y;

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
        double xDiff = this.x - point.getX();
        double yDiff = this.y - point.getY();
        return Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
    }

    public Point difference(Point point) {
        double newX = this.x - point.getX();
        double newY = this.y - point.getY();
        return new Point(newX, newY);
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
        double newX = (this.x + point.getX()) / 2;
        double newY = (this.y + point.getY()) / 2;
        return new Point(newX, newY);
    }

    public Point sum(Point point) {
        double newX = this.x + point.getX();
        double newY = this.y + point.getY();
        return new Point(newX, newY);
    }

}
