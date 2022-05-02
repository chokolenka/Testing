package com.company.StringTests;

import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise1Test {
    @Test
    public void getIndexes() {
        int index1 = "Java Exercises!".charAt(0);
        int index2 = "Java Exercises!".charAt(10);
        assertEquals ("The character at position 0 is J","The character at position 0 is " +
                (char) index1);
        assertEquals ("The character at position 10 is i","The character at position 10 is " +
                (char) index2);
    }
}