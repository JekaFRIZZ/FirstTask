package com.epam.task.first.entities;

import java.util.ArrayList;
import java.util.List;

public class Array {

    private final List<Integer> elements;

    public Array(Integer...elements) {
        this.elements = new ArrayList<Integer>();
        for(Integer element: elements) {
            this.elements.add(element);
        }
    }

    public Array(List<Integer> elements) {
        this.elements = elements;
    }

    public List<Integer> getElements() {
        return elements;
    }
}
