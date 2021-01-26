package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;

public class ArrayLogic {

    public int findMax(Array<Integer> array) {
        int max = array.getElements().get(0);

        for(int element : array.getElements()) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    public int findMin(Array<Integer> array) {
        int min = array.getElements().get(0);

        for(int element : array.getElements()) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    public boolean isNegative(Array<Integer> array) {
        int countNegative = 0;
        for(int element: array.getElements()) {
            if(element < 0) {
                countNegative++;
            }
        }
        return countNegative == array.getElements().size();
    }

    public double findAverageValue(Array<Integer> array) {
        if(array.getElements().size() == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        double sum = 0;

        for(int element : array.getElements()) {
            sum += (double) element;
        }

        return sum/array.getElements().size();
    }

    public int findSum(Array<Integer> array) {
        int sum = 0;

        for(int element : array.getElements()) {
            sum += element;
        }
        return sum;
    }

    public int countPositive(Array<Integer> array) {
        int positive = 0;

        for(int element: array.getElements()) {
            if (element > 0) {
                positive++;
            }
        }
        return positive;
    }

    public int countNegative(Array<Integer> array) {
        int negative = 0;

        for(int element: array.getElements()) {
            if (element < 0) {
                negative++;
            }
        }
        return negative;
    }
}
