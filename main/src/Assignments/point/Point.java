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
        return x;
    }

    public double getY() {
        return y;
    }

    public void displayCoordinate() {
        System.out.printf("X coord is %f \nYcoord is %f\n", x, y);
    }

    public double distance(Point point) {
        double xDiff = x - point.getX();
        double yDiff = y - point.getY();
        return Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
    }

    public Point difference(Point point) {
        double newX = x - point.getX();
        double newY = y - point.getY();
        return new Point(newX, newY);
    }

    public double slope(Point point) {
        return (point.getY() - y) / (point.getX() - x);
    }

    public double yIntercept(Point point) {
        double m = slope(point);
        return y - m * x;
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
        double newX = (x + point.getX()) / 2;
        double newY = (y + point.getY()) / 2;
        return new Point(newX, newY);
    }

    public Point sum(Point point) {
        double newX = x + point.getX();
        double newY = y + point.getY();
        return new Point(newX, newY);
    }

}
