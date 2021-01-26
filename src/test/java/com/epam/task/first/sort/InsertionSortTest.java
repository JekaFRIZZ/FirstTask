package com.epam.task.first.sort;

import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;

public class InsertionSortTest {
    private final InsertionSort sort = new InsertionSort();
    @Test
    public void testInsertionSortShouldSortWhenPositiveNumbersApplied() {
        Array<Integer> array = new Array<>(1,5,3,4);

        Array<Integer> actual = sort.sort(array);
        Array<Integer> expected = new Array<>(1,3,4,5);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testInsertionSortShouldSortWhenEmptyArrayApplied() {
        Array<Integer> array = new Array<>();

        Array<Integer> actual = sort.sort(array);
        Array<Integer> expected = new Array<>();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testInsertionSortShouldSortWhenOneNumberApplied() {
        Array<Integer> array = new Array<>(55);

        Array<Integer> actual = sort.sort(array);
        Array<Integer> expected = new Array<>(55);

        Assert.assertEquals(expected,actual);
    }
}
