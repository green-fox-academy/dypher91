import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;



    public class SierpinskyCarpet {

        public static void mainDraw(Graphics graphics) {
            int initialX = WIDTH/3;
            int initialY = HEIGHT/3;
            int size = WIDTH/3;
          //  drawRectangles(initialX,initialY,size,graphics);
            drawRectanglesWithRecursion(initialX,initialY,size,graphics);


        }

        public static void drawRectangles(int initialX, int initialY, int size, Graphics graphics){
            Random random = new Random();
            graphics.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255),random.nextInt(255)));
            graphics.fillRect(initialX,initialY,size,size);
        }

        public static void drawRectanglesWithRecursion(int initialX, int initialY, int size, Graphics graphics){
            drawRectangles(initialX,initialY,size,graphics);
            if (size > 1){

                drawRectanglesWithRecursion(initialX+size/3,initialY-size/3*2,size/3,graphics);
                drawRectanglesWithRecursion(initialX-size/3*2,initialY + size/3,size/3,graphics);

                drawRectanglesWithRecursion(initialX+size/3,initialY + size/3*4,size/3,graphics);
                drawRectanglesWithRecursion(initialX+size/3*4,initialY + size/3,size/3,graphics);

                drawRectanglesWithRecursion(initialX-size/3*2,initialY + size/3*4,size/3,graphics);
                drawRectanglesWithRecursion(initialX+size/3*4,initialY + size/3*4,size/3,graphics);

                drawRectanglesWithRecursion(initialX-size/3*2,initialY - size/3*2,size/3,graphics);
                drawRectanglesWithRecursion(initialX+size/3*4,initialY - size/3*2,size/3,graphics);

                }

        }


        // Don't touch the code below
        static int WIDTH = 500;
        static int HEIGHT = 500;

        public static void main(String[] args) {
            JFrame jFrame = new JFrame("Drawing");
            jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            ImagePanel panel = new ImagePanel();
            panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
            jFrame.add(panel);
            jFrame.setLocationRelativeTo(null);
            jFrame.setVisible(true);
            jFrame.pack();
        }

        static class ImagePanel extends JPanel {
            @Override
            protected void paintComponent(Graphics graphics) {
                super.paintComponent(graphics);
                mainDraw(graphics);
            }
        }
    }

