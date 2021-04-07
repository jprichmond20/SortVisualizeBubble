package edu.coe.richmond;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphPanel gp = new GraphPanel();
        frame.getContentPane().add(gp);
        frame.pack();
        frame.setVisible(true);

        //Invert bubble sort paintComponent, do not start at the beginning, start at the end
        //Create list of numbers and pass it into each SortPanel from MainPanel
        //Fix the "pass reference" using object "clone" method

    }
}
