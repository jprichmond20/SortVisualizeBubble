package edu.coe.richmond;

import java.util.ArrayList;
import java.util.Collections;

public class SelectionStrategy implements SortStrategy{

    @Override
    public void nextSortStep(ArrayList<Integer> values, ArrayList<Integer> sortedValues) {
        int smallest;
        smallest = Collections.min(values);
        sortedValues.add(smallest);
        values.remove((Integer)smallest);
       }
}
