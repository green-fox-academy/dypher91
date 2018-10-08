import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class squareG {
    public static void mainDraw(Graphics graphics) {
        int initialX =WIDTH/2;
        int initialY =WIDTH/2;
        int size=WIDTH;
        int parametr=5;

        drawSquare(graphics,initialX ,initialY,size,parametr);
        drawSquares(graphics,initialX,initialY,size,parametr);


    }

    public static void drawSquare(Graphics graphics,int initialX,int initialY, int size, int parametr){
        if(parametr == 0){
        }else {
            graphics.drawRect(initialX-size/4,initialY-size/2,size/2,size/2);
            drawSquare(graphics,initialX,initialY,size,parametr-1);
        }
    }

    public static void drawSquares(Graphics graphics, int initialX, int initialY, int size, int parametr){
        if (parametr == 0) {
        }else{
            drawSquare(graphics,initialX,initialY,size,parametr-1);
            drawSquares(graphics, initialX - (size/4), initialY - (size / 4), size/2, parametr-1);
            drawSquares(graphics, initialX + (size/4), initialY - (size / 4), size/2, parametr-1);
          /*  drawSquares(graphics, initialX + (size/4), initialY + (size / 4), size/2, parametr-1);
            drawSquares(graphics, initialX - (size/4), initialY + (size / 4), size/2, parametr-1);*/
        }
    }



    static int WIDTH = 600;
    static int HEIGHT = 600;

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

