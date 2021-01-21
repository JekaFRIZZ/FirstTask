package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;

public class ArrayLogicTest {

    private ArrayLogic arrayLogic = new ArrayLogic();

    @Test
    public void testFindMaxShouldFindMaxWhenPositiveNumbersApplied() {

        Array array = new Array(1,5,7);

        int actual = arrayLogic.findMax(array);

        Assert.assertEquals(7,actual);
    }

    @Test
    public void testFindMaxShouldFindMaxWhenNegativeNumbersApplied() {

        Array array = new Array(-1,-5,-7);

        int actual = arrayLogic.findMax(array);

        Assert.assertEquals(-1,actual);
    }

    @Test
    public void testFindMaxShouldFindMaxWhenAllNumberAreZero() {

        Array array = new Array(0,0,0);

        int actual = arrayLogic.findMax(array);

        Assert.assertEquals(0,actual);
    }

    @Test
    public void testFindMinShouldFindMaxWhenPositiveNumbersApplied() {

        Array array = new Array(1,5,7);

        int actual = arrayLogic.findMin(array);

        Assert.assertEquals(1,actual);
    }

    @Test
    public void testFindMinShouldFindMaxWhenNegativeNumbersApplied() {

        Array array = new Array(-1,-5,-7);

        int actual = arrayLogic.findMin(array);

        Assert.assertEquals(-7,actual);
    }

    @Test
    public void testFindMinShouldFindMaxWhenZeroNumbersApplied() {

        Array array = new Array(0,0,0);

        int actual = arrayLogic.findMin(array);

        Assert.assertEquals(0,actual);
    }

    @Test
    public void testNegativeShouldDefineNegativeArrayWhenPositiveNumbersApplied() {

        Array array = new Array(1,5,6);

        boolean actual = arrayLogic.isNegative(array);

        Assert.assertTrue(!actual);
    }

    @Test
    public void testNegativeShouldDefineNegativeArrayWhenNegativeNumbersApplied() {

        Array array = new Array(-1,-5,-7);

        boolean actual = arrayLogic.isNegative(array);

        Assert.assertTrue(actual);
    }

    @Test
    public void testNegativeShouldDefineNegativeArrayWhenZeroNumbersApplied() {

        Array array = new Array(0,0,0);

        boolean actual = arrayLogic.isNegative(array);

        Assert.assertTrue(!actual);
    }

    @Test
    public void testNegativeShouldDefineNegativeArrayWhenDifferentNumbersApplied() {

        Array array = new Array(1,0,-5);

        boolean actual = arrayLogic.isNegative(array);

        Assert.assertTrue(!actual);
    }

    @Test
    public void testfindAverageValueShouldFindAverageValueWhenPositiveNumbersApplied() {

        Array array = new Array(1,5,7);

        double actual = arrayLogic.findAverageValue(array);

        Assert.assertEquals(4.333,actual,0.001);
    }

    @Test
    public void testfindAverageValueShouldFindAverageValueWhenNegativeNumbersApplied() {

        Array array = new Array(-1,-5,-7);

        double actual = arrayLogic.findAverageValue(array);

        Assert.assertEquals(-4.333,actual,0.001);
    }

    @Test
    public void testfindAverageValueShouldFindAverageValueWhenZeroNumbersApplied() {

        Array array = new Array(0,0,0);

        double actual = arrayLogic.findAverageValue(array);

        Assert.assertEquals(0,actual,0.001);
    }

    @Test
    public void testfindSumShouldFindSumWhenPositiveNumbersApplied() {

        Array array = new Array(1,5,7);

        int actual = arrayLogic.findSum(array);

        Assert.assertEquals(13,actual);
    }

    @Test
    public void testfindSumShouldFindSumWhenNegativeNumbersApplied() {

        Array array = new Array(-1,-5,-7);

        int actual = arrayLogic.findSum(array);

        Assert.assertEquals(-13,actual);
    }

    @Test
    public void testfindSumShouldFindSumWhenZeroNumbersApplied() {

        Array array = new Array(0,0,0);

        int actual = arrayLogic.findSum(array);

        Assert.assertEquals(0,actual);
    }

    @Test
    public void testcountPositiveNegativeShouldСountPositiveNegativeWhenPositiveNumbersApplied() {

        Array array = new Array(1,5,7);

        int[] actual = arrayLogic.countPositiveNegative(array);

        Assert.assertArrayEquals(new int[]{3, 0},actual);
    }

    @Test
    public void testcountPositiveNegativeShouldСountPositiveNegativeWhenNegativeNumbersApplied() {

        Array array = new Array(-1,-5,-7);

        int[] actual = arrayLogic.countPositiveNegative(array);

        Assert.assertArrayEquals(new int[]{0, 3},actual);
    }

    @Test
    public void testcountPositiveNegativeShouldСountPositiveNegativeWhenZeroNumbersApplied() {

        Array array = new Array(0,0,0);

        int[] actual = arrayLogic.countPositiveNegative(array);

        Assert.assertArrayEquals(new int[]{0, 0},actual);
    }

    @Test
    public void testcountPositiveNegativeShouldСountPositiveNegativeWhenDifferentNumbersApplied() {

        Array array = new Array(1,0,-5);

        int[] actual = arrayLogic.countPositiveNegative(array);

        Assert.assertArrayEquals(new int[]{1, 1},actual);
    }
}
