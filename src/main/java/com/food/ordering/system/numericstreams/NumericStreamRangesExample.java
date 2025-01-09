package com.food.ordering.system.numericstreams;

import java.util.stream.IntStream;

public class NumericStreamRangesExample {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1,50);
        IntStream intStreamClosed = IntStream.rangeClosed(1,50);
        System.out.println(intStream.count());
        IntStream.range(1,50).forEach((value -> System.out.print(value+",")));
        //System.out.println(intStreamClosed.count());
    }
}
