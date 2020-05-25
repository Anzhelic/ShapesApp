package an.riabushenko.com;

import java.util.Locale;

public class Square implements Shape
    {
        private double side;
        private Colors color;

        public Square(Colors color, double side) {
            this.color = color;
            this.side = side;
        }

        public double getSide () {
        return side;
    }

        @Override
        public void draw () {
        System.out.println(this);
    }

        @Override
        public double getArea () {
        return side * side;
    }

        @Override
        public Colors getColor () {
        return color;
    }

        @Override
        public String toString () {
        return "Фигурa: квадрат, площадь: " + String.format(Locale.US, "%.2f", getArea()) + " кв.ед., длина стороны: " + String.format(Locale.US, "%.2f", getSide()) + " ед., цвет: " + getColor();
    }
    }
