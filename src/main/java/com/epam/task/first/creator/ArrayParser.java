package com.epam.task.first.creator;

import com.epam.task.first.entities.Array;



public class ArrayParser {

    public Array<Integer> parse(String data) {
        String[] elements = data.split(" ");

        Array<Integer> array = new Array<>();

        for(String element : elements) {
            Integer number = Integer.parseInt(element);
            array.add(number);
        }
        return  array;
    }
}
