package edu.coe.richmond;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class SortPanel extends JPanel {

    public static final int NUM_ITEMS = 70;
    public static final int RANGE = 40;
    public static final int INSERT= 1;
    public static final int SELECT = 2;
    public static final int BUBBLE = 3;

    ArrayList<Integer> values;
    ArrayList<Integer> sortedValues;
    int gap = 15;
    int totalBars;
    int barWidth;
    int barUnitHeight;
    boolean running;
    SortStrategy ss;


    public SortPanel() {
        setPreferredSize(new Dimension(500,500));
        values = new ArrayList<Integer>();
        sortedValues = new ArrayList<Integer>();
        running = false;
        ss = new InsertionStrategy();
    }

    public SortPanel(ArrayList<Integer> nums){
        super();
        setValues(nums);
    }

    public void setStrategy(int s){
        if (!running) {
            switch (s) {
                case INSERT:
                    ss = new InsertionStrategy();
                    break;
                case SELECT:
                    ss = new SelectionStrategy();
                    break;
                case BUBBLE:
                    ss = new BubbleStrategy();
                    break;
            }
        }
    }

    public void setValues(ArrayList<Integer> values) {
        this.values = values;
        sortedValues = new ArrayList<Integer>();
        gap = 3;
        totalBars = values.size() + sortedValues.size();
        barWidth = (getWidth() - (gap * (totalBars+1)))/totalBars;
        barUnitHeight = (getHeight() - 2* gap)/ Collections.max(values);

        System.out.println(totalBars +" "+barWidth + " " + barUnitHeight);
        repaint();
    }

    public void start(){
        running = true;
        ss.nextSortStep(values, sortedValues);
        repaint();
    }

    public void reset(){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < NUM_ITEMS; i++){
            nums.add( (int) (Math.random()* RANGE) +1);
        }
        setValues(nums);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        gap = 3;
        g.setColor(Color.BLUE);
        int n = 0;
        int xLoc;
        for (int i: sortedValues){
            g.setColor(Color.RED);
            xLoc = (n+1)*gap + n*barWidth;
            g.fillRect(xLoc, getHeight() -gap- barUnitHeight*i, barWidth, barUnitHeight*i);
            n+=1;
        }
        for (int i: values){
            g.setColor(Color.BLUE);
            xLoc = (n+1)*gap + n*barWidth;
            g.fillRect(xLoc, getHeight() -gap- barUnitHeight*i, barWidth, barUnitHeight*i);
            n+=1;
        }
        if (running){
            if (values.size() > 0){
                ss.nextSortStep(values, sortedValues);
                try {
                    Thread.sleep(125);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                repaint();
            }
            else{
                running = false;
            }
        }
    }

}
