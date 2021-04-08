package edu.coe.richmond;

import java.util.ArrayList;

public class BubbleStrategy implements SortStrategy {

    @Override
    public void nextSortStep(ArrayList<Integer> values, ArrayList<Integer> sortedValues) {
        int temp;
        //int i = sortedValues.size();
        for (int i = values.size() - 1; i > 0; i--) {
            if (values.get(i) < values.get(i - 1)) {
                temp = values.get(i);
                values.set(i, values.get(i - 1));
                values.set(i - 1, temp);
            }
        }
        sortedValues.add(values.get(0));
        values.remove(0);
        System.out.println(sortedValues.size());


        //values.remove(i);

    }
}
