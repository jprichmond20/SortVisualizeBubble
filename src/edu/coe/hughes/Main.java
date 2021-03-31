package edu.coe.hughes;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphPanel gp = new GraphPanel();
        frame.getContentPane().add(gp);
        frame.pack();
        frame.setVisible(true);
    }
}
