import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class Diagonals {
    public static void mainDraw(Graphics diagonals) {
        // Draw the canvas' diagonals.
        // If it starts from the upper-left corner it should be green, otherwise it should be red.
        diagonals.setColor(Color.green);
        diagonals.drawLine(0, 0, WIDTH, HEIGHT);
        diagonals.setColor(Color.red);
        diagonals.drawLine(WIDTH / 2, 0, WIDTH / 2, HEIGHT);
        diagonals.drawLine(0, HEIGHT / 2, WIDTH, HEIGHT/2);
        diagonals.drawLine(0, HEIGHT, WIDTH, 0);
    }
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}