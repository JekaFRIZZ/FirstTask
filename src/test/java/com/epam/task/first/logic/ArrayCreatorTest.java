package com.epam.task.first.logic;

import com.epam.task.first.ArrayCreator;
import com.epam.task.first.creator.ArrayParser;
import com.epam.task.first.creator.ArrayValidator;
import com.epam.task.first.data.DataException;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class ArrayCreatorTest {

    private final static List<String> TEST_DATE = Arrays.asList("1 2 3", "2g 3 4 3");
    private final static String TEST_FILE_DATA = "./src/test/resources/input.txt";
    private final static List<String> TEST_EMPTY = Collections.singletonList("");

    @Test
    public void testArrayCreatorShouldCreateWhenCorrectArraysApplied() throws DataException {

        DataReader reader = Mockito.mock(DataReader.class);
        when(reader.readDate(anyString())).thenReturn(TEST_DATE);

        ArrayValidator validator = Mockito.mock(ArrayValidator.class);
        when(validator.validate(anyString())).thenReturn(true);

        ArrayParser parser = Mockito.mock(ArrayParser.class);
        when(parser.parse("1 2 3")).thenReturn(new Array<>(1,2,3));
        when(parser.parse("2 3 4 3")).thenReturn(new Array<>(2,3,4,3));

        ArrayCreator creator = new ArrayCreator(reader,validator,parser);
        List<Array<Integer>> actual = creator.process(TEST_FILE_DATA);
        List<Array<Integer>> expected = new ArrayList<>();

        expected.add(new Array<>(1,2,3));
        expected.add(null);

        Assert.assertEquals(expected,actual );
    }

    @Test
    public void testArrayCreatorShouldEmptyArrayWhenNothingCreate() throws DataException {
        DataReader reader = Mockito.mock(DataReader.class);
        when(reader.readDate(anyString())).thenReturn(TEST_EMPTY);

        ArrayValidator validator = Mockito.mock(ArrayValidator.class);
        when(validator.validate(anyString())).thenReturn(false);

        ArrayParser parser = Mockito.mock(ArrayParser.class);
        when(parser.parse(anyString())).thenReturn(new Array<>());

        ArrayCreator creator = new ArrayCreator(reader,validator,parser);
        List<Array<Integer>> actual = creator.process("");
        List<Array<Integer>> expected = new ArrayList<>();

        Assert.assertEquals(expected,actual);
    }
}
