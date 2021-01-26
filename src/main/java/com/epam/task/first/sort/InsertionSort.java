package com.epam.task.first.sort;

import com.epam.task.first.entities.Array;

import java.util.List;

public class InsertionSort implements Sortable {

    public Array<Integer> sort(Array<Integer> array) {
        int size = array.getElements().size();
        List<Integer> elements = array.getElements();

        for(int i = 1; i < size; i++) {
            int current = elements.get(i);
            int j = i - 1;

            while (j >= 0 && current < elements.get(j)) {
                elements.set(j + 1, elements.get(j));
                j--;
            }
            elements.set(j + 1, current);
        }
        return new Array<>(elements);
    }
}
