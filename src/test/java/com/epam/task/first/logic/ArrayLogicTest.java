package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;

public class ArrayLogicTest {

    private ArrayLogic arrayLogic = new ArrayLogic();

    private final double delta = 0.001;

    @Test
    public void testFindMaxShouldFindMaxWhenPositiveNumbersApplied() {

        Array<Integer> array = new Array<Integer>(1,5,7);

        int actual = arrayLogic.findMax(array);

        Assert.assertEquals(7,actual);
    }

    @Test
    public void testFindMaxShouldFindMaxWhenNegativeNumbersApplied() {

        Array<Integer> array = new Array<Integer>(-1,-5,-7);

        int actual = arrayLogic.findMax(array);

        Assert.assertEquals(-1,actual);
    }

    @Test
    public void testFindMaxShouldFindMaxWhenAllNumberAreZero() {

        Array<Integer> array = new Array<Integer>(0,0,0);

        int actual = arrayLogic.findMax(array);

        Assert.assertEquals(0,actual);
    }

    @Test
    public void testFindMinShouldFindMaxWhenPositiveNumbersApplied() {

        Array<Integer> array = new Array<Integer>(1,5,7);

        int actual = arrayLogic.findMin(array);

        Assert.assertEquals(1,actual);
    }

    @Test
    public void testFindMinShouldFindMaxWhenNegativeNumbersApplied() {

        Array<Integer> array = new Array<Integer>(-1,-5,-7);

        int actual = arrayLogic.findMin(array);

        Assert.assertEquals(-7,actual);
    }

    @Test
    public void testFindMinShouldFindMaxWhenZeroNumbersApplied() {

        Array<Integer> array = new Array<Integer>(0,0,0);

        int actual = arrayLogic.findMin(array);

        Assert.assertEquals(0,actual);
    }

    @Test
    public void testNegativeShouldDefineNegativeArrayWhenPositiveNumbersApplied() {

        Array<Integer> array = new Array<Integer>(1,5,6);

        boolean actual = arrayLogic.isNegative(array);

        Assert.assertFalse(actual);
    }

    @Test
    public void testNegativeShouldDefineNegativeArrayWhenNegativeNumbersApplied() {

        Array<Integer> array = new Array<Integer>(-1,-5,-7);

        boolean actual = arrayLogic.isNegative(array);

        Assert.assertTrue(actual);
    }

    @Test
    public void testNegativeShouldDefineNegativeArrayWhenZeroNumbersApplied() {

        Array<Integer> array = new Array<Integer>(0,0,0);

        boolean actual = arrayLogic.isNegative(array);

        Assert.assertFalse(actual);
    }

    @Test
    public void testNegativeShouldDefineNegativeArrayWhenDifferentNumbersApplied() {

        Array<Integer> array = new Array<Integer>(1,0,-5);

        boolean actual = arrayLogic.isNegative(array);

        Assert.assertFalse(actual);
    }

    @Test
    public void testFindAverageValueShouldFindAverageValueWhenPositiveNumbersApplied() {

        Array<Integer> array = new Array<Integer>(1,5,7);

        double actual = arrayLogic.findAverageValue(array);

        Assert.assertEquals(4.333,actual,delta);
    }

    @Test
    public void testFindAverageValueShouldFindAverageValueWhenNegativeNumbersApplied() {

        Array<Integer> array = new Array<Integer>(-1,-5,-7);

        double actual = arrayLogic.findAverageValue(array);

        Assert.assertEquals(-4.333,actual,delta);
    }

    @Test
    public void testFindAverageValueShouldFindAverageValueWhenZeroNumbersApplied() {

        Array<Integer> array = new Array<Integer>(0,0,0);

        double actual = arrayLogic.findAverageValue(array);

        Assert.assertEquals(0,actual,delta);
    }

    @Test
    public void testFindSumShouldFindSumWhenPositiveNumbersApplied() {

        Array<Integer> array = new Array<Integer>(1,5,7);

        int actual = arrayLogic.findSum(array);

        Assert.assertEquals(13,actual);
    }

    @Test
    public void testFindSumShouldFindSumWhenNegativeNumbersApplied() {

        Array<Integer> array = new Array<Integer>(-1,-5,-7);

        int actual = arrayLogic.findSum(array);

        Assert.assertEquals(-13,actual);
    }

    @Test
    public void testFindSumShouldFindSumWhenZeroNumbersApplied() {

        Array<Integer> array = new Array<Integer>(0,0,0);

        int actual = arrayLogic.findSum(array);

        Assert.assertEquals(0,actual);
    }

    @Test
    public void testCountPositiveShouldСountPositiveWhenPositiveNumbersApplied() {

        Array<Integer> array = new Array<Integer>(1,5,7);

        int actual = arrayLogic.countPositive(array);

        Assert.assertEquals(3,actual);
    }

    @Test
    public void testCountPositiveShouldСountPositiveWhenNegativeNumbersApplied() {

        Array<Integer> array = new Array<Integer>(-1,-5,-7);

        int actual = arrayLogic.countPositive(array);

        Assert.assertEquals(0,actual);
    }

    @Test
    public void testCountPositiveShouldСountPositiveWhenDifferentNumbersApplied() {

        Array<Integer> array = new Array<Integer>(-1,4,-7);

        int actual = arrayLogic.countPositive(array);

        Assert.assertEquals(1,actual);
    }

    @Test
    public void testCountPositiveShouldСountPositiveWhenZeroNumbersApplied() {

        Array<Integer> array = new Array<Integer>(0,0,0);

        int actual = arrayLogic.countPositive(array);

        Assert.assertEquals(0,actual);
    }

    @Test
    public void testCountNegativeShouldСountPositiveWhenPositiveNumbersApplied() {

        Array<Integer> array = new Array<Integer>(1,5,7);

        int actual = arrayLogic.countNegative(array);

        Assert.assertEquals(0,actual);
    }

    @Test
    public void testCountNegativeShouldСountPositiveWhenNegativeNumbersApplied() {

        Array<Integer> array = new Array<Integer>(-1,-5,-7);

        int actual = arrayLogic.countNegative(array);

        Assert.assertEquals(3,actual);
    }

    @Test
    public void testCountNegativeShouldСountPositiveWhenDifferentNumbersApplied() {

        Array<Integer> array = new Array<Integer>(-1,4,-7);

        int actual = arrayLogic.countNegative(array);

        Assert.assertEquals(2,actual);
    }

    @Test
    public void testCountNegativeShouldСountPositiveWhenZeroNumbersApplied() {

        Array<Integer> array = new Array<Integer>(0,0,0);

        int actual = arrayLogic.countNegative(array);

        Assert.assertEquals(0,actual);
    }
}
