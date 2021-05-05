package Task.Builder;

import Task.Start;
import Task.shapes.Circle;
import Task.shapes.Shape;

import java.awt.*;

public class CircleBuilder implements ShapeBuilder {
    @Override
    public Shape BuildShape() {
        return new Circle(
                new Color(Start.rand.nextInt(256), Start.rand.nextInt(256), Start.rand.nextInt(256)),
                Start.rand.nextInt(80)+5
        );
    }
}
