package shapeProcess;

import shapePack.*;
import java.util.Scanner;

public class ShapeExecute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating objects for Square and SemiCircle
        Square square = new Square();
        SemiCircle semiCircle = new SemiCircle();

        // Calling print methods for Square, Rectangle, and Shape using Square object
        square.printShape();
        square.printRectangle();
        square.printSquare();

        // Area calculation for Square
        System.out.println("\nArea of Square");
        System.out.print("Enter the measure of a side: ");
        double side = scanner.nextDouble();
        double squareArea = square.calculateArea(side);
        System.out.println("RESULT: Area of Square= " + squareArea);

        // Area calculation for Rectangle
        System.out.println("\nArea of Rectangle:");
        System.out.print("Enter the measure of length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the measure of breadth: ");
        double breadth = scanner.nextDouble();
        double rectangleArea = square.calculateArea(length, breadth); // Using square object
        System.out.println("RESULT: Area of Rectangle= " + rectangleArea);

        System.out.println("----");

        // Calling print methods for SemiCircle, Circle, and Shape using SemiCircle object
        semiCircle.printShape();
        semiCircle.printSemiCircle();
        semiCircle.printCircle();

        scanner.close();
    }
}
