package day9.Task2;

public class Rectangle extends Figure{

    private double width;
    private double length;

    public Rectangle( double width, double length, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }


    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2*(length + width);
    }
}
