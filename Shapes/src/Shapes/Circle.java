package Shapes;

public class Circle {
    double radius;
    String color;

    public Circle(double radius, String color){
        this.color = color;
        this.radius = radius;
    }
    public double getArea(){
        return 3.14 * radius * radius;
    }
}
