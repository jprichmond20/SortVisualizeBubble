package edu.coe.richmond;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ComparePanel extends JPanel {
    private SortPanel ins;
    private SortPanel sel;
    private SortPanel bubb;
    private JButton start;
    private JButton reset;
    private JPanel ctrlPanel;
    private JRadioButton insert;
    private JRadioButton select;
    private JRadioButton bubble;
    private ButtonGroup bg;
    ArrayList<Integer> nums;
    public static final int NUM_ITEMS = 70;
    public static final int RANGE = 40;

    public ComparePanel() {
        setPreferredSize(new Dimension(500, 500));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setNums();

        ins = new SortPanel((ArrayList<Integer>) nums.clone());
        ins.setStrategy(SortPanel.INSERT);
        sel = new SortPanel((ArrayList<Integer>) nums.clone());
        sel.setStrategy(SortPanel.SELECT);
        bubb = new SortPanel((ArrayList<Integer>) nums.clone());
        bubb.setStrategy(SortPanel.BUBBLE);




        add(ins);
        add(sel);
        add(bubb);

        ctrlPanel = new JPanel();
        start = new JButton("Start");
        reset = new JButton("Reset");
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ins.start();
                sel.start();
                bubb.start();
            }
        });
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ins.reset();
                sel.reset();
                bubb.reset();
            }
        });
        /*insert = new JRadioButton("Insertion");
        select = new JRadioButton("Selection");
        bubble = new JRadioButton("Bubble");

        bg = new ButtonGroup();
        bg.add(insert);
        bg.add(select);
        bg.add(bubble);

        insert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sp.setStrategy(SortPanel.INSERT);
            }
        });

        select.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sp.setStrategy(SortPanel.SELECT);
            }
        });

        bubble.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sp.setStrategy(SortPanel.BUBBLE);
            }
        });*/

        ctrlPanel.add(start);
        ctrlPanel.add(reset);
        //ctrlPanel.add(insert);
        //ctrlPanel.add(select);
        //ctrlPanel.add(bubble);
        add(ctrlPanel);
    }

    private void setNums() {
        nums = new ArrayList<Integer>();
        for (int i = 0; i < NUM_ITEMS; i++){
            nums.add( (int) (Math.random()* RANGE) +1);
        }
    }
}




