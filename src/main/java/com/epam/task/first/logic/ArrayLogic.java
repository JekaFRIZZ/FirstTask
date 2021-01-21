package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;

public class ArrayLogic {

    public int findMax(Array array) {
        int max = array.getElements().get(0);

        for(int element : array.getElements()) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    public int findMin(Array array) {
        int min = array.getElements().get(0);

        for(int element : array.getElements()) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    public boolean isNegative(Array array) {
        int countNegative = 0;
        for(int element: array.getElements()) {
            if(element < 0) {
                countNegative++;
            }
        }
        return countNegative == array.getElements().size();
    }

    public double findAverageValue(Array array) {
        if(array.getElements().size() == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        double sum = 0;

        for(int element : array.getElements()) {
            sum += (double) element;
        }

        return sum/array.getElements().size();
    }

    public int findSum(Array array) {
        int sum = 0;

        for(int element : array.getElements()) {
            sum += element;
        }
        return sum;
    }

    public int[] countPositiveNegative(Array array) {
        int[] quantity = new int[2];
        int positive = 0;
        int negative = 0;

        for(int element: array.getElements()) {
            if(element > 0) {
                positive++;
            }
            else if(element < 0) {
                negative++;
            }
        }
        quantity[0] = positive;
        quantity[1] = negative;

        return quantity;
    }
}
