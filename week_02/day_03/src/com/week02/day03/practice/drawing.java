package com.week02.day03.practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class drawing extends JPanel {

    public void paintComponent (Graphics g){

        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        g.setColor(Color.BLUE);
        g.fillRect(25, 25,100,30);

        g.setColor(new Color(190, 81, 215));
        g.fillRect(25,65,100,30);

        g.setColor(Color.RED);
        g.drawString("This is some MiGHTy TeXT!",25, 120);

    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("This is the title! :)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        drawing draw = new drawing();
        frame.add(draw);
        frame.setSize(400,250);
        frame.setVisible(true);

    }
}