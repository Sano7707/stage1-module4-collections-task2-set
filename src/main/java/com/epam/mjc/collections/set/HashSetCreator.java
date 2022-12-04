package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;


public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < sourceList.size(); i++) {
            int num = sourceList.get(i);
            if(num % 2 == 0){
                while (num % 2 != 1){
                    set.add(num);
                    num /= 2;
                }
                set.add(1);
            }
            else {
                set.add(num);
                set.add(2*num);
            }
        }
        return set;

    }
}
