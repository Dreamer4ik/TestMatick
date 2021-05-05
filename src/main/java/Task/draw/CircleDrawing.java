package Task.draw;

import Task.shapes.Circle;
import Task.shapes.Shape;

import java.awt.*;

public class CircleDrawing extends ShapeDrawing{

    int radius;

    public CircleDrawing(Shape shape) {
        super(shape);
        this.radius = ((Circle) shapeThis).getRadius();
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Font plainFont = new Font("Serif", Font.PLAIN, 24);
        g2.setFont(plainFont);
        g2.setColor(colorThis);
        g.fillOval(80, 80, radius*2, radius*2);
        g2.setColor(Color.BLACK);
        g.drawOval(80, 80, radius*2, radius*2);
        g.drawString(shapeThis.toString(), 80, 300);
    }
}
