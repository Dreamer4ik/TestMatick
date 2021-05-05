package Task.draw;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import Task.shapes.Shape;

public class ShapeDrawing extends Frame {
    protected Color colorThis;
    protected Shape shapeThis;
    private static int xLocation;
    private static int yLocation;

    public ShapeDrawing(Shape shape) {
        super("Shape");
        this.colorThis = shape.getColor();
        this.shapeThis = shape;
        prepareGUI();
    }

    private void prepareGUI() {
        setSize(1500, 400);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                dispose();
            }
        });
        setVisible(true);

        xLocation += 50;
        yLocation += 50;
        setLocation(xLocation, yLocation);
    }

    public Color getColorThis() {
        return colorThis;
    }

    public Shape getShapeThis() {
        return shapeThis;
    }
}
