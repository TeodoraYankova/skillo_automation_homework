package L8_OOP;

class Circle extends Shape {
    private double radius;

    @Override
    public double getArea(double radius) {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter(double radius) {
        return 2 * Math.PI * radius;
    }
}
