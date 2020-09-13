package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers){
        List<Integer> noOddsList = new ArrayList<>();

        for(int x : numbers){
            if(x % 2 == 0){
                noOddsList.add(x);
            }
        }

        return noOddsList;
    }
}
