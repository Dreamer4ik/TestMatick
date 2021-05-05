package Task.Builder;

import Task.Start;
import Task.shapes.Shape;
import Task.shapes.Trapeze;

import java.awt.*;

public class TrapezeBuilder extends ShapeBuilder {
    @Override
    public Shape BuildShape() {
        int base1 = Start.rand.nextInt(50) + 5;
        int base2 = Start.rand.nextInt(50) + 5;
        int h = Start.rand.nextInt(50) + 5;


        return new Trapeze(
                new Color(Start.rand.nextInt(256), Start.rand.nextInt(256), Start.rand.nextInt(256)),
                base1, base2, h
        );
    }
}
