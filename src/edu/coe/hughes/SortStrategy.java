package edu.coe.hughes;

import java.util.ArrayList;

public interface SortStrategy {
    public void nextSortStep(ArrayList<Integer> values, ArrayList<Integer> sortedValues);
}
