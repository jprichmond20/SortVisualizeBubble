package edu.coe.richmond;

import java.util.ArrayList;

public class InsertionStrategy implements SortStrategy {

    public void nextSortStep(ArrayList<Integer> values, ArrayList<Integer> sortedValues) {
        int item = values.remove(0);
        int i = 0;
        while (i < sortedValues.size() && item > sortedValues.get(i)) {
            i++;
        }
        sortedValues.add(i, item);
    }
}