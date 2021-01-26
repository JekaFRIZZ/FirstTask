package com.epam.task.first.creator;

public class ArrayValidator {

    public boolean validate(String line) {
            String[] elements = line.split(" ");
            for(String element : elements) {
                try {
                    Integer.parseInt(element);
                } catch (NumberFormatException e) {
                    return false;
                }
            }
            return true;
    }
}
