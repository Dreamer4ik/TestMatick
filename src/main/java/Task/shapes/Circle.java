package Task.shapes;

import java.awt.*;

public class Circle implements Shape{
    private int radius;
    private Color color;

    public Circle(int radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void draw() {

    }

    @Override
    public int getSpace() {
        return 0;
    }

    @Override
    public Color getColor() {
        return null;
    }
}
