package edu.coe.richmond;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    public ComparePanel() {
        setPreferredSize(new Dimension(500, 500));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        ins = new SortPanel();
        ins.setStrategy(SortPanel.INSERT);
        sel = new SortPanel();
        sel.setStrategy(SortPanel.SELECT);
        bubb = new SortPanel();
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
}




