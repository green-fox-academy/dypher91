import javax.swing.*;

import java.awt.*;
import java.util.HashMap;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawSquareFractals {
    public static void mainDraw(Graphics graphics) {
        int size = 320;
        int xStart = 0;
        int yStart = 0;
        drawMyFractalWithRecursion(xStart, yStart, size, graphics);

    }

    private static void drawMySquares(int xStart, int yStart, int size, Graphics graphics) {
        graphics.drawRect(xStart, yStart, size, size);
        graphics.setColor(Color.BLACK);
    }

    private static void drawMyFractalWithRecursion(int xStart, int yStart, int size, Graphics graphics) {
        drawMySquares(xStart, yStart, size, graphics);
        if(size > 3) {
            drawMyFractalWithRecursion(xStart + size / 3, yStart, size / 3, graphics);
            drawMyFractalWithRecursion(xStart, yStart + size / 3, size / 3, graphics);
            drawMyFractalWithRecursion(xStart + 2 * size / 3, yStart + size / 3, size / 3, graphics);
            drawMyFractalWithRecursion(xStart + size / 3, yStart + 2 * size / 3, size / 3, graphics);
        }
    }


    // Don't touch the code below
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