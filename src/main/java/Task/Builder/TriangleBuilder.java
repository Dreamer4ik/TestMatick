package Task.Builder;

import Task.Start;
import Task.shapes.Shape;
import Task.shapes.Triangle;

import java.awt.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class TriangleBuilder implements ShapeBuilder{
    @Override
    public Shape BuildShape() {
        int side1, side2;
        double side3;
        {
            side1 = Start.rand.nextInt(50)+5;
            side2 = Start.rand.nextInt(50)+5;
            side3 = new BigDecimal(Math.sqrt((side1*side1+side2*side2))).setScale(3, RoundingMode.UP).doubleValue();
        }

        return new Triangle(
                new Color(Start.rand.nextInt(256), Start.rand.nextInt(256), Start.rand.nextInt(256)),
                side1, side2, side3);
    }
}
