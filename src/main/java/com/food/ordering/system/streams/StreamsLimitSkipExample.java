package com.food.ordering.system.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {
    public static Optional<Integer>limit(List<Integer>integerList){
       return integerList.stream()
                .skip(2)
                .reduce((x,y)->x+y);
    }

    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(6,7,8,9,10);
        System.out.println(limit(integerList));
    }
}
