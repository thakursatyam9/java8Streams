package com.food.ordering.system.numericstreams;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericStreamAggregateExample {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 50).sum();
        System.out.println(" Sum is : "+sum);

        OptionalInt max = IntStream.rangeClosed(1, 50).max();
        System.out.println(" Optional Int Max "+max);
    }
}
