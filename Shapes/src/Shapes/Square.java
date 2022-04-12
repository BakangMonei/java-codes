package Shapes;

public class Square {
    double length;
    String color;
    public Square(double length, String color) {
        this.length = length;
        this.color = color;
    }
    public double getArea(){
        return length * length;
    }
}
