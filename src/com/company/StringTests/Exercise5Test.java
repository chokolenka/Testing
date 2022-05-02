package com.company.StringTests;

import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise5Test {
    @Test
public void Comparison(){
        String str1 = "This is Exercise 1";
        String str2 = "This is Exercise 2";
        int result = "This is Exercise 1".compareTo("This is Exercise 2");
        assertEquals(String.valueOf(true),"This is Exercise 1" + " is less than " + "This is Exercise 2",
                "" + str1 + "" +" is less than " + "" + str2 + "");
        assertEquals(String.valueOf(false),"This is Exercise 1" + " is equal to " + "This is Exercise 2",
                "" + str1 + "" +" is equal to " + "" + str2 + "");
        assertEquals(String.valueOf(false),"This is Exercise 1" + " is greater than " + "This is Exercise 2",
                "" + str1 + "" +" is greater than " + "" + str2 + "");
    }
}