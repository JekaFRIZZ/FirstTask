package com.epam.task.first.sort;

import com.epam.task.first.entities.Array;

import java.util.List;

public class BubbleSort implements Sortable {

    public Array<Integer> sort(Array<Integer> array) {
        int size = array.getElements().size();
        List<Integer> elements = array.getElements();

        for(int i = 0; i < size; i++) {
            for(int j = size - 1; j > i; j--) {
                if(elements.get(j - 1) > elements.get(j)) {
                    int temporary = elements.get(j - 1);
                    elements.set(j - 1, elements.get(j));
                    elements.set(j, temporary);
                }

            }
        }
        return new Array<Integer>(elements);
    }
}
