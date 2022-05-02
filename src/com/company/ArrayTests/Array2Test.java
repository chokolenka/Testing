package com.company.ArrayTests;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static java.lang.String.*;

public class Array2Test {
    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Original Array : "+Arrays.toString(my_array));
        System.out.println(removeIndex(my_array));
    }
    @Test
    public static String removeIndex(int[] my_array){
        int removeIndex = 1;
        System.arraycopy(my_array, removeIndex + 1, my_array, removeIndex, my_array.length - 1 - removeIndex);
        return "After removing the second element:" +Arrays.toString(my_array);
    }

}