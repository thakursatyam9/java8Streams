package com.food.ordering.system.streams;

import com.food.ordering.system.data.Student;
import com.food.ordering.system.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduce {
    public static int performMultiplication(List<Integer>integerList){
      return   integerList.stream()
                .reduce(2,(a,b)->a*b);
    }
    public static Optional<Student>getHighestGpa(){
       return StudentDataBase.getAllStudents().stream()
                .reduce((s1,s2)->(s1.getGpa()>s2.getGpa()) ? s1 : s2);
    }
    public static void main(String[] args) {
        List<Integer> integers= Arrays.asList(1,3,5,7);
        System.out.println(performMultiplication(integers));

        System.out.println();
        System.out.println(getHighestGpa());
    }
}
