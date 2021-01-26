package com.epam.task.first.sort;

import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {
    private final BubbleSort sort = new BubbleSort();

    @Test
    public void testBubbleSortShouldSortWhenPositiveNumbersApplied() {
        Array<Integer> array = new Array<>(1,5,3,4);

        Array<Integer> actual = sort.sort(array);
        Array<Integer> expected = new Array<>(1,3,4,5);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testBubbleSortShouldSortWhenEmptyArrayApplied() {
        Array<Integer> array = new Array<>();

        Array<Integer> actual = sort.sort(array);
        Array<Integer> expected = new Array<>();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testBubbleSortShouldSortWhenOneNumberApplied() {
        Array<Integer> array = new Array<>(55);

        Array<Integer> actual = sort.sort(array);
        Array<Integer> expected = new Array<>(55);

        Assert.assertEquals(expected,actual);
    }
}
