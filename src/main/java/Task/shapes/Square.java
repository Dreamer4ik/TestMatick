package Task.shapes;

import java.awt.*;

public class Square implements Shape{
   private int side;
   private Color color;

    public Square(int side, Color color) {
        this.side = side;
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
