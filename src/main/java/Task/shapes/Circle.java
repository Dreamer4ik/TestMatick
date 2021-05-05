package Task.shapes;

import Task.draw.CircleDrawing;

import java.awt.*;

public class Circle implements Shape{
    private int radius;
    private Color color;

    public Circle(Color color, int radius) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void draw() {
        new CircleDrawing(this);
    }

    @Override
    public int getSpace() {
        return  ((int) (Math.PI * Math.pow(radius, 2)));
    }

    @Override
    public Color getColor() {
        return color;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Фигура: круг, площадь " + getSpace() + " кв. ед., радиус: " +  radius +
                " ед., цвет (R, G, B) : " + color.getRed() + ", " + color.getGreen() + ", " + color.getBlue() + ".";
    }
}
