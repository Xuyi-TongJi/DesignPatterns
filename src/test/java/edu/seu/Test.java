package edu.seu;

import edu.seu.interpreter.application.Calculator;
import org.junit.Assert;

import java.util.Arrays;
import java.util.Stack;

public class Test {
    @org.junit.Test
    public void method() {
        String test = "a";
        char[] chars = new char[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Assert.assertFalse(Arrays.toString(chars).contains(test));
    }
}
