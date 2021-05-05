package Task.draw;

import Task.shapes.Shape;
import Task.shapes.Square;

import java.awt.*;

public class SquareDrawing extends ShapeDrawing {
    int side;
    public SquareDrawing(Shape shape) {
        super(shape);
        this.side = ((Square) shape).getSide();
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Font plainFont = new Font("Serif", Font.PLAIN, 24);
        g2.setFont(plainFont);
        g2.setColor(colorThis);
        g.fillRect(35, 45, 35+side, 45+side);
        g2.setColor(Color.BLACK);
        g.drawRect(35, 45, 35+side, 45+side);
        g.drawString(shapeThis.toString(), 80, 300);
    }
}
