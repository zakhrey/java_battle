package ru.zakhrey.java_battle.awt_plot;

import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

public class SimplePlot extends Canvas {
    public static void main(String[] args) {
        JFrame frame = new JFrame( "Мой рисунок" );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new SimplePlot();
        canvas.setSize(400, 400);
        frame.add(canvas); frame.pack();
        frame.setVisible( true );
    }

    public void paint(Graphics g) {
        g.fillOval(100, 100, 200, 200);
    }

}
