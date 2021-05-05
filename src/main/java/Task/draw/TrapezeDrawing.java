package Task.draw;

import Task.shapes.Shape;
import Task.shapes.Trapeze;

import java.awt.*;

public class TrapezeDrawing extends ShapeDrawing {
    int base1, base2, h;


    public TrapezeDrawing(Shape shape) {
        super(shape);
        this.base1 = ((Trapeze) shape).getBase1();
        this.base2 = ((Trapeze) shape).getBase2();
        this.h = ((Trapeze) shape).getH();
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Font plainFont = new Font("Serif", Font.PLAIN, 24);
        g2.setFont(plainFont);
        g2.setColor(colorThis);
        g.drawString(shapeThis.toString(), 80, 300);

        int x1, x2, x3, y1, y2, y3, x4, y4;
        x1 = 50;
        y1 = 50;
        x2 = x1 + base1;
        y2 = y1;
        x3 = x2;
        y3 = y2 + h;
        x4 = x2 - base2;
        y4 = y3;

        int[] xPoints = new int[4];
        int[] yPoints = new int[4];
        xPoints[0] = x1;
        yPoints[0] = y1;
        xPoints[1] = x2;
        yPoints[1] = y2;
        xPoints[2] = x3;
        yPoints[2] = y3;
        xPoints[3] = x4;
        yPoints[3] = y4;

        g2.setFont(plainFont);
        g2.setColor(colorThis);
        g.fillPolygon(xPoints, yPoints, 4);
        g2.setColor(Color.BLACK);
        g.drawPolygon(xPoints, yPoints, 4);
        g.drawString(shapeThis.toString(), 80, 300);

    }
}

