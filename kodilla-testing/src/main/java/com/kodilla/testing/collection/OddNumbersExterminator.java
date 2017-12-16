package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class OddNumbersExterminator {
    public static ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        Iterator<Integer> iteratorForRemoving = numbers.iterator();
        while(iteratorForRemoving.hasNext()) {
            Integer number = iteratorForRemoving.next();
            if (number % 2 != 0) {
                numbers.remove(number);
            }
        }
        return numbers;
    }
}
