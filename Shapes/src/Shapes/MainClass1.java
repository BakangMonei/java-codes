package Shapes;

import Shapes.Circle;
import Shapes.Square;

public class MainClass1 {
    public static void main(String[] args){
        Circle c1 = new Circle(21, "Red");
        Square s1 = new Square(4, "Blue");

        System.out.println("Area of the " + "circle is " + c1.getArea());
        System.out.println("Area of the " + "square is " + s1.getArea());
    }
}
