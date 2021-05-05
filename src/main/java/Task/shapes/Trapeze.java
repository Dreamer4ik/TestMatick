package Task.shapes;

import java.awt.*;

public class Trapeze implements Shape {
    private int base1, base2, h;
    private Color color;

    public Trapeze(Color color, int base1, int base2, int h) {
        this.base1 = base1;
        this.base2 = base2;
        this.h = h;
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

    public int getBase1() {
        return base1;
    }

    public int getBase2() {
        return base2;
    }

    public int getH() {
        return h;
    }
}
