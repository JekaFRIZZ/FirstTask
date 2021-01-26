package com.epam.task.first.creator;

import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;



public class ArrayParserTest {

    @Test
    public void testArrayParserShouldParseWhenCorrectNumberApplied() {

        ArrayParser parser = new ArrayParser();

        Array<Integer> actual =  parser.parse("1 2 3");

        Assert.assertEquals(new Array<Integer>(1,2,3),actual);
    }

    @Test(expected = NumberFormatException.class)
    public void testArrayParserShouldParseWhenIncorrectNumberApplied() {

        ArrayParser parser = new ArrayParser();

        Array<Integer> actual =  parser.parse("1r 2 3");

    }
}
