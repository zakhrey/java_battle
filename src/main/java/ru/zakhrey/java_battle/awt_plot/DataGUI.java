package ru.zakhrey.java_battle.awt_plot;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

class DataGUI extends JFrame{
    DataGUI() {
        super("X,Y Plot");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(800, 400));
        this.pack();
        this.setSize(new Dimension(800, 600));
        this.setLocationRelativeTo(null);


        setLayout(new GridLayout());
        ArrayList<Double> myDiffs = new ArrayList<>();
        myDiffs.add(25.0);
        myDiffs.add(9.0);
        myDiffs.add(7.0);
        myDiffs.add(16.0);
        myDiffs.add(15.0);
        myDiffs.add(6.0);
        myDiffs.add(2.0);
        myDiffs.add(8.0);
        myDiffs.add(2.0);
        myDiffs.add(27.0);
        myDiffs.add(14.0);
        myDiffs.add(12.0);
        myDiffs.add(19.0);
        myDiffs.add(10.0);
        myDiffs.add(11.0);
        myDiffs.add(8.0);
        myDiffs.add(19.0);
        myDiffs.add(2.0);
        myDiffs.add(16.0);
        myDiffs.add(5.0);
        myDiffs.add(18.0);
        myDiffs.add(23.0);
        myDiffs.add(9.0);
        myDiffs.add(4.0);
        myDiffs.add(8.0);
        myDiffs.add(9.0);
        myDiffs.add(3.0);
        myDiffs.add(3.0);
        myDiffs.add(9.0);
        myDiffs.add(13.0);
        myDiffs.add(17.0);
        myDiffs.add(7.0);
        myDiffs.add(0.0);
        myDiffs.add(2.0);
        myDiffs.add(3.0);
        myDiffs.add(33.0);
        myDiffs.add(23.0);
        myDiffs.add(26.0);
        myDiffs.add(12.0);
        myDiffs.add(12.0);
        myDiffs.add(19.0);
        myDiffs.add(14.0);
        myDiffs.add(9.0);
        myDiffs.add(26.0);
        myDiffs.add(24.0);
        myDiffs.add(13.0);
        myDiffs.add(19.0);
        myDiffs.add(2.0);
        myDiffs.add(7.0);
        myDiffs.add(28.0);
        myDiffs.add(15.0);
        myDiffs.add(2.0);
        myDiffs.add(5.0);
        myDiffs.add(17.0);
        myDiffs.add(2.0);
        myDiffs.add(16.0);
        myDiffs.add(19.0);
        myDiffs.add(2.0);
        myDiffs.add(31.0);
        DataPanel myPP = new DataPanel(myDiffs,this.getHeight(),this.getWidth());
        this.add(myPP);
        this.setVisible(true);// Display the panel.
    }
    public static void main(String[] args){
        DataGUI myDataGUI = new DataGUI();
        myDataGUI.setVisible(true);
    }
}
