package Task.Builder;

import Task.Start;
import Task.shapes.Shape;
import Task.shapes.Square;

import java.awt.*;

public class SquareBuilder implements ShapeBuilder {
    @Override
    public Shape BuildShape() {
        return new Square(
                new Color(Start.rand.nextInt(256), Start.rand.nextInt(256), Start.rand.nextInt(256)),
                Start.rand.nextInt(50) + 5
        );
    }
}

