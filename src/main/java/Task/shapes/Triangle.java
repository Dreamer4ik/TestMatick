package Task.shapes;

import java.awt.*;

public class Triangle implements Shape {
    private int side1, side2;
    private double side3;
    private  Color color;

    public Triangle(int side1, int side2, double side3, Color color) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
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
