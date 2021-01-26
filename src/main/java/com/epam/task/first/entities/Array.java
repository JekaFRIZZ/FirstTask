package com.epam.task.first.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Array<I extends Number> {

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

    @Override
    public String toString() {
        return "Array{" +
                "elements=" + elements +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array<?> array = (Array<?>) o;
        return Objects.equals(elements, array.elements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elements);
    }

    public void add(Integer number) {
        elements.add(number);
    }
}
