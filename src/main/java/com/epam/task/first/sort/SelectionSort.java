package com.epam.task.first.sort;

import com.epam.task.first.entities.Array;

import java.util.List;

public class SelectionSort implements Sortable {

    public Array<Integer> sort(Array<Integer> array) {
         int size = array.getElements().size();
        List<Integer> elements = array.getElements();

        for(int i = 0; i < size; i++) {
            int min = elements.get(i);
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if(elements.get(j) < min) {
                    min = elements.get(j);
                    minIndex = j;
                }
            }

            int temporary = elements.get(i);
            elements.set(i, min);
            elements.set(minIndex, temporary);
        }
        return new Array<>(elements);
    }
}
