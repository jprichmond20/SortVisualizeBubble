package edu.coe.richmond;

import java.util.ArrayList;

public interface SortStrategy {
    public void nextSortStep(ArrayList<Integer> values, ArrayList<Integer> sortedValues);
}
