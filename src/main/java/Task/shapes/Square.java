package Task.shapes;

import java.awt.*;

public class Square implements Shape{
   private int side;
   private Color color;

    public Square(Color color, int side) {
        this.color = color;
        this.side = side;
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

    public int getSide() {
        return side;
    }
}
