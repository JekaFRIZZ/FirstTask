package com.epam.task.first.creator;

import org.junit.Assert;
import org.junit.Test;

public class ArrayValidatorTest {

    @Test
    public void testValidateShouldValidateWhenCorrectStringApplied() {
        ArrayValidator validator = new ArrayValidator();

        boolean actual = validator.validate("1 2 3 4");

        Assert.assertTrue(actual);
    }

    @Test
    public void testValidateShouldValidateWhenOneCorrectCharApplied() {
        ArrayValidator validator = new ArrayValidator();

        boolean actual = validator.validate("1");

        Assert.assertTrue(actual);
    }

    @Test
    public void testValidateShouldValidateWhenEmptyStringApplied() {
        ArrayValidator validator = new ArrayValidator();

        boolean actual = validator.validate("");

        Assert.assertFalse(actual);
    }

    @Test
    public void testValidateShouldValidateWhenIncorrectStringApplied() {
        ArrayValidator validator = new ArrayValidator();

        boolean actual = validator.validate("1 2 3f 4");

        Assert.assertFalse(actual);
    }

    @Test
    public void testValidateShouldValidateWhenIncorrectSplitApplied() {
        ArrayValidator validator = new ArrayValidator();

        boolean actual = validator.validate("1 2   3 4");

        Assert.assertFalse(actual);
    }
}
