import java.util.Scanner;
class Demo23{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        
        Geometry geometry = new Geometry();

        
        System.out.print("side length of the square: ");
        double squareSide = sc.nextDouble();
        double squareArea = geometry.calculateArea(squareSide);
        System.out.println("Area of the square: " + squareArea);

        
        System.out.print(" length of the rectangle: ");
        double rectangleLength = sc.nextDouble();
        System.out.print(" width of the rectangle: ");
        double rectangleWidth = sc.nextDouble();
        double rectangleArea = geometry.calculateArea(rectangleLength, rectangleWidth);
        System.out.println("Area of the rectangle: " + rectangleArea);

        
        System.out.print("Enter the radius of the circle: ");
        double circleRadius = sc.nextDouble();
        double circleArea = geometry.calculateArea(circleRadius, "circle");
        System.out.println("Area of the circle: " + circleArea);

    }
}
class Geometry{
    private double side;
    private double length;
    private double width;
    private double radius;

    double calculateArea(double side) {
        return side * side;
    }

    double calculateArea(double length, double width) {
        return length * width;
    }

    
    double calculateArea(double radius, String shape) {
        if (shape.equalsIgnoreCase("circle")) {
            return Math.PI * Math.pow(radius, 2);
        } else {
            
            System.out.println("Invalid shape specified for circle area calculation.");
            return 0;
        }
    }
}