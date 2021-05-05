package Task.shapes;

import Task.draw.SquareDrawing;

import java.awt.*;
import java.util.Arrays;

public class Square implements Shape{
   private int side;
   private Color color;

    public Square(Color color, int side) {
        this.color = color;
        this.side = side;
    }


    @Override
    public void draw() {
        new SquareDrawing(this);
    }

    @Override
    public int getSpace() {
        return side*side;
    }

    @Override
    public Color getColor() {
        return color;
    }

    public int[] getSideArr() {
        int [] arr = {side};
        return arr;
    }

    public int getSide() {
        return side;
    }

    @Override
    public String toString() {
        return "Фигура: квадрат, площадь " + getSpace() + " кв. ед., длина сторон(ы): " +  Arrays.toString(getSideArr()) +
                " ед., цвет (R, G, B) : " + color.getRed() + ", " + color.getGreen() + ", " + color.getBlue() + ".";
    }
}
