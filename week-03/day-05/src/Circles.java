import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static java.awt.Frame.getFrames;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


    public class Circles {


        public static void mainDraw(Graphics graphics) {
            int initialX = 0;
            int initialY = 0;
            int size = WIDTH;

            drawCircleslesWithRecursion(initialX,initialY,size,graphics);
           // drawCircles(initialX,initialY,size,graphics);
            //graphics.drawOval(0,0,300,300);



        }

        public static void drawCircles(int initialX, int initialY, int size, Graphics graphics){
            Random random = new Random();
            //graphics.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255),random.nextInt(255)));
            graphics.setColor(Color.BLACK);
            graphics.drawOval(initialX,initialY,size,size);
        }

        public static void drawCircleslesWithRecursion(int initialX, int initialY, int size, Graphics graphics){
            drawCircles(initialX,initialY,size,graphics);
            if (size > +40){
                drawCircleslesWithRecursion(initialX+size/4,initialY,size/2,graphics);
                drawCircleslesWithRecursion(initialX,initialY+size/4,size/2,graphics);
                drawCircleslesWithRecursion(initialX+size/2,initialY+size/4,size/2,graphics);
                

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



