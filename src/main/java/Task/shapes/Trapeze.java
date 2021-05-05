package Task.shapes;

import Task.draw.TrapezeDrawing;

import java.awt.*;
import java.util.Arrays;

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
        new TrapezeDrawing(this);
    }

    @Override
    public int getSpace() {
        return (base1+base2)/2*h;
    }

    @Override
    public Color getColor() {
        return color;
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

    int[] sideArr() {
        int [] arr = {base1, base2, h};
        return arr;
    }


    @Override
    public String toString() {
        return "Фигура: трапеция, площадь " + getSpace() + " кв. ед., стороны: " +  Arrays.toString(sideArr()) +
                " ед., цвет (R, G, B) : " + color.getRed() + ", " + color.getGreen() + ", " + color.getBlue() + ".";
    }
}
