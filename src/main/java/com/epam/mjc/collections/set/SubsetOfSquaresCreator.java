package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer> set = new TreeSet<>();
        for (Integer integer : sourceList) {
            set.add((int) Math.pow(integer, 2));
        }
        Set<Integer> ns;
        ns =  set.subSet(lowerBound,upperBound+1);
        return ns;
    }

}
