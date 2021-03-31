package edu.coe.hughes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphPanel extends JPanel {
    private SortPanel sp;
    private JButton start;
    private JButton reset;
    private JPanel ctrlPanel;
    private JRadioButton insert;
    private JRadioButton select;
    private ButtonGroup bg;

    public GraphPanel() {
        setPreferredSize(new Dimension(500, 500));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        sp = new SortPanel();
        add(sp);
        ctrlPanel = new JPanel();
        start = new JButton("Start");
        reset = new JButton("Reset");
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sp.start();
            }
        });
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sp.reset();
            }
        });
        insert = new JRadioButton("Insertion");
        select = new JRadioButton("Selection");
        bg = new ButtonGroup();
        bg.add(insert);
        bg.add(select);

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

        ctrlPanel.add(start);
        ctrlPanel.add(reset);
        ctrlPanel.add(insert);
        ctrlPanel.add(select);
        add(ctrlPanel);
    }
}




