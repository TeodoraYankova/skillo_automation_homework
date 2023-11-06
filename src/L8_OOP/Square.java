package L8_OOP;

public class Square extends Shape {

    private double side;

    @Override
    public double getArea(double side) {
        return side * side;
    }

    @Override
    public double getPerimeter(double side) {
        return side*4;
    }
}
