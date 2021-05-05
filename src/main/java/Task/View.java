package Task;

import Task.draw.ShapeDrawing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame {

    private JButton b1;
    private JLabel l1, l2, l3;
    private JTextField t1;
    private Handler handler = new Handler();


    public View(String s) throws HeadlessException {
        super(s);
        setLayout(new FlowLayout());

        l1 = new JLabel("The maximum amount of figures : ");
        l2 = new JLabel("      Designed by Potapenko Ivan      ");
        l3 = new JLabel("dreamer4ik@gmail.com");
        t1 = new JTextField(5);
        t1.setText("10");
        b1 = new JButton("Start");
        add(l1);
        add(t1);
        add(b1);
        add(l2);
        add(l3);
        b1.addActionListener(handler);
    }

    public class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == b1) {
                try {
                    Start.maxAmountOfShapes = Integer.parseInt(t1.getText());
                    try {
                        if (Start.maxAmountOfShapes <= 0) throw new WrongNumberException("введите корректное число");
                    } catch (WrongNumberException ex) {JOptionPane.showMessageDialog(null, "введите целое положительное число");}
                    ShapeDrawing.xLocation = 0;
                    ShapeDrawing.yLocation = 0;
                    Start.start();
                } catch (Exception e1) {
                    JOptionPane.showMessageDialog(null, "введите в поле число");
                    e1.printStackTrace();
                }
            }
        }

    }




}
