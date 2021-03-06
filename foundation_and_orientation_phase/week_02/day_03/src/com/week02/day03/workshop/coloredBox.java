package com.week02.day03.workshop;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class coloredBox {
    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.BLUE);
        graphics.drawLine(10,10,110,10);

        graphics.setColor(Color.RED);
        graphics.drawLine(110,10, 110,110);

        graphics.setColor(Color.GREEN);
        graphics.drawLine(110,110,10,110);

        graphics.setColor(Color.ORANGE);
        graphics.drawLine(10,110,10,10);
    }

    static int WIDTH = 320;
    static int HEIGHT = 320;

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