package com.epam.task.first;

import com.epam.task.first.data.DataException;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.entities.Array;
import com.epam.task.first.creator.ArrayParser;
import com.epam.task.first.creator.ArrayValidator;

import java.util.ArrayList;
import java.util.List;

public class ArrayCreator {

    private DataReader dataReader;
    private ArrayValidator validator;
    private ArrayParser parser;

    public ArrayCreator(final DataReader dataReader, final ArrayValidator validator, final ArrayParser parser) {
        this.dataReader = dataReader;
        this.validator = validator;
        this.parser = parser;
    }

    public List<Array<Integer>> process(String filename) throws DataException {
        List<String> data = dataReader.readDate(filename);
        List<Array<Integer>> arrays = new ArrayList<>();

        for(String line : data) {
            if (validator.validate(line)) {
                Array<Integer> numbers = parser.parse(line);
                arrays.add(numbers);
            }
        }
        return arrays;
    }
}
