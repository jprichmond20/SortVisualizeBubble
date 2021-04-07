package edu.coe.richmond;

import java.util.ArrayList;

public class BubbleStrategy implements SortStrategy {

    @Override
    public void nextSortStep(ArrayList<Integer> values, ArrayList<Integer> sortedValues) {
        int temp;
        int i = sortedValues.size();
        boolean cont = true;
        while (cont) {
            sortedValues.add(values.get(i));
            if (sortedValues.size() > 2 && i > 0) {
                if (sortedValues.get(i) < sortedValues.get(i - 1)) {
                    temp = sortedValues.get(i);
                    sortedValues.set(i, sortedValues.get(i - 1));
                    sortedValues.set(i - 1, temp);
                    i--;
                    cont = true;
                } else {
                    cont = false;
                }
            }
        }
            System.out.println(sortedValues.size());


        values.remove(i);

    }
}
