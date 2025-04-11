package Assignments.line;

public class Runner {
    public static void main(String[] args) {
        
        // Create two points to test
        Point point1 = new Point(3.0, 4.0);
        Point point2 = new Point(6.0, 8.0);
        Point point3 = new Point();
        
        // Display coordinates of the points
        System.out.println("Point 1:");
        point1.displayCoordinate();
        
        System.out.println("Point 2:");
        point2.displayCoordinate();
        
        // Calculate and display distance between points
        double distance = point1.distance(point2);
        System.out.println("\nDistance between point1 and point2: " + distance);
        
        // Calculate and display difference between points
        Point difference = point1.difference(point2);
        System.out.println("\nDifference between point1 and point2:");
        difference.displayCoordinate();
        
        // Calculate and display slope between points
        double slope = point1.slope(point2);
        System.out.println("\nSlope between point1 and point2: " + slope);
        
        // Calculate and display y-intercept
        double yIntercept = point1.yIntercept(point2);
        System.out.println("\nY-Intercept of the line through point1 and point2: " + yIntercept);
        
        // Display the linear equation
        System.out.println("\nLinear Equation between point1 and point2: ");
        point1.linearEquation(point2);
        
        // Calculate and display midpoint
        Point midpoint = point1.midpoint(point2);
        System.out.println("\nMidpoint between point1 and point2:");
        midpoint.displayCoordinate();
        
        // Calculate and display sum of points
        Point sum = point1.sum(point2);
        System.out.println("\nSum of point1 and point2:");
        sum.displayCoordinate();

        System.out.println(point3.getX() + " " + point3.getY());
    }
}