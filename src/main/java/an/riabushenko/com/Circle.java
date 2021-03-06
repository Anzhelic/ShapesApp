package an.riabushenko.com;

import java.util.Locale;

public class Circle implements Shape {
    private double radius;
    private Colors color;

    public Circle(Colors color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public Colors getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Фигура: круг, площадь: " + String.format(Locale.US, "%.2f", getArea()) + " кв.ед., радиус: " + String.format(Locale.US, "%.2f", getRadius()) + " ед., цвет: " + getColor();
    }
}
