package com.epam.task.first.sort;

import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;

public class SelectionSortTest {

    private final SelectionSort sort = new SelectionSort();

    @Test
    public void testSelectionSortShouldSortWhenPositiveNumbersApplied() {
        Array<Integer> array = new Array<>(1,5,3,4);

        Array<Integer> actual = sort.sort(array);
        Array<Integer> expected = new Array<>(1,3,4,5);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testSelectionSortShouldSortWhenEmptyArrayApplied() {
        Array<Integer> array = new Array<>();

        Array<Integer> actual = sort.sort(array);
        Array<Integer> expected = new Array<>();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testSelectionSortShouldSortWhenOneNumberApplied() {
        Array<Integer> array = new Array<>(55);

        Array<Integer> actual = sort.sort(array);
        Array<Integer> expected = new Array<>(55);

        Assert.assertEquals(expected,actual);
    }
}
