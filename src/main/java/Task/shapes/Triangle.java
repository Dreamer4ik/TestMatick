package Task.shapes;

import Task.draw.TriangleDrawing;

import java.awt.*;
import java.util.Arrays;

public class Triangle implements Shape {
    private int side1, side2;
    private double side3;
    private Color color;

    public Triangle(Color color, int side1, int side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.color = color;
    }

    @Override
    public void draw() {
        new TriangleDrawing(color, side1, side2, this);
    }

    @Override
    public int getSpace() {
        int p = (int) (side1+side2+side3)/2;
        int s = (int) Math.sqrt((p*(p-side1)*(p-side2)*(p-side3)));
        return s;
    }

    @Override
    public Color getColor() {
        return color;
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

  public   double[] getSideArr() {
        double [] arr = {side1, side2, side3};
        return arr;
    }

    public double getHypotenuse() {
        double hypotenuse = 0;
        for(double i : getSideArr()){
            if(hypotenuse < i) hypotenuse = i;
        }
        return hypotenuse;
    }

    @Override
    public String toString() {
         return "Фигура: треугольник, площадь " + getSpace() + " кв. ед., длина сторон: " +  Arrays.toString(getSideArr()) +
                " ед., цвет (R, G, B) : " + color.getRed() + ", " + color.getGreen() + ", " + color.getBlue() + ", гипотенуза: " + getHypotenuse() + "";
    }
}
