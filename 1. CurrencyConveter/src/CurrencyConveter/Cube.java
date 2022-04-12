package CurrencyConveter;

import java.util.Objects;

public class Cube {
        int length;
        int width;
        int height;

        // Constructors
    public Cube( int length, int width, int height){
            this.length = length;
            this.width = width;
            this.height = height;
        }

    // Getter and Setters
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getCalculateVolume() {
        return length * width * height;
    }


    // equals() and hashCodes()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cube cube = (Cube) o;
        return length == cube.length && width == cube.width && height == cube.height;
    }
    @Override
    public int hashCode() {
        return Objects.hash(length, width, height);
    }
    // toString() methods

    @Override
    public String toString() {
        return "Cube{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}

class main{
    public static void main(String[] arg){
         Cube vol = new Cube(9, 9, 9);
        System.out.println("The volume of the cube is: " + "\n" + vol.getCalculateVolume());
    }
}