package com.company.StringTests;

import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise22Test {
    @Test
    public void getLength(){
        int len = "example.com".length();
       assertEquals("The string length of 'example.com' is: 11", "The string length of 'example.com' is: "+len);



    }

}