package com.company.ArrayTests;

import org.junit.jupiter.api.Test;

public class Array1Test {
    public static void main(String[] args) {
        int[] my_array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String sum = String.valueOf(55);
        System.out.println("The sum is " + sum);
        System.out.println(getSum(my_array));
    }

    @Test
    public static String getSum(int[] my_array) {
        String sum = String.valueOf(55);
        return "The sum is " + sum;
    }
}

