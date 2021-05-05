package Task.draw;

import Task.shapes.Shape;
import Task.shapes.Triangle;

import java.awt.*;

public class TriangleDrawing extends ShapeDrawing {
    int side1, side2;

    public TriangleDrawing(Color color, int side1, int side2, Shape shape) {
        super(shape);
        this.side1 = ((Triangle) shapeThis).getSide1();
        this.side2 = ((Triangle) shapeThis).getSide2();
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Font plainFont = new Font("Serif", Font.PLAIN, 24);

        int x1, x2, x3, y1, y2, y3;
        x1 = 50;
        y1 = 50;
        x2 = x1 + side1;
        y2 = y1;
        x3 = x2;
        y3 = y2 + side2;
        int[] xPoints = new int[3];
        int[] yPoints = new int[3];

        xPoints[0] = x1;
        yPoints[0] = y1;
        xPoints[1] = x2;
        yPoints[1] = y2;
        xPoints[2] = x3;
        yPoints[2] = y3;

        g2.setFont(plainFont);

        g2.setColor(colorThis);
        g.fillPolygon(xPoints, yPoints, 3);
        g2.setColor(Color.BLACK);
        g.drawPolygon(xPoints, yPoints, 3);
        g.drawString(shapeThis.toString(), 80, 300);

    }
}


