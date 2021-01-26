package com.epam.task.first.data;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataReaderTest {

    private final static String TEST_DATE = "./src/test/resources/input.txt";
    private final static String TEST_EMPTY = "./src/test/resources/empty.txt";
    private final static String TEST_NOT_EXIST = "./src/test/resources/not_exist.txt";

    private final static DataReader reader = new DataReader();

    @Test
    public void testDataReadShouldReadFileWhenDifferentStringApplied() throws DataException {

        List<String> expected = Arrays.asList("1 2 3","5a 5r");

        List<String> actual = reader.readDate(TEST_DATE);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testDataReadShouldReadFileWhenFileEmpty() throws DataException {

        List<String> expected = new ArrayList<>();

        List<String> actual = reader.readDate(TEST_EMPTY);

        Assert.assertEquals(expected,actual);
    }

    @Test(expected = DataException.class)
    public void testDataReadShouldDataExceptionWhenFileNotExist() throws DataException{
        List<String> actual = reader.readDate(TEST_NOT_EXIST);
    }
}
