package an.riabushenko.com;

import java.math.BigDecimal;
import java.math.RoundingMode;

public interface ShapeBuilder {
    Shape BuildShape();
}
class CircleBuilder implements ShapeBuilder {

    @Override
    public Shape BuildShape() {
        return new Circle(Colors.randomColor(), Main.rand.nextInt(80) + 5);
    }
}

class SquareBuilder implements ShapeBuilder {

    @Override
    public Shape BuildShape() {
        return new Square(Colors.randomColor(), Main.rand.nextInt(50) + 5);
    }
}

class TriangleBuilder implements ShapeBuilder {

    @Override
    public Shape BuildShape() {
        int side1, side2;
        double side3;
        {
            side1 = Main.rand.nextInt(50) + 5;
            side2 = Main.rand.nextInt(50) + 5;
            side3 = new BigDecimal(Math.sqrt((side1 * side1 + side2 * side2))).setScale(3, RoundingMode.UP).doubleValue();
        }

        return new Triangle(Colors.randomColor(), side1, side2, side3);
    }
}

class TrapezeBuilder implements ShapeBuilder {

    @Override
    public Shape BuildShape() {
        int base1 = Main.rand.nextInt(50) + 5;
        int base2 = Main.rand.nextInt(50) + 5;
        int height = Main.rand.nextInt(50) + 5;

        return new Trapeze(Colors.randomColor(), base1, base2, height);
    }
}
