package shapeProcess;

import shapePack.*;

public class ShapeExecute {
    public static void main(String[] args) {
        // Creating objects for Square and SemiCircle
        Square square = new Square();
        SemiCircle semiCircle = new SemiCircle();

        // Calling print methods for Square, Rectangle, and Shape using Square object
        square.printShape();
        square.printRectangle();
        square.printSquare();
        
        System.out.println("----");
        
        // Calling print methods for SemiCircle, Circle, and Shape using SemiCircle object
        semiCircle.printShape();
        semiCircle.printSemiCircle();
        semiCircle.printCircle();
    }
}
