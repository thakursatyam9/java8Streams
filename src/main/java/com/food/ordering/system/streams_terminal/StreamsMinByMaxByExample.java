package com.food.ordering.system.streams_terminal;

import com.food.ordering.system.data.Student;
import com.food.ordering.system.data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;

import static java.util.stream.Collectors.minBy;
import static java.util.stream.Collectors.toList;

public class StreamsMinByMaxByExample {
    public static Optional<Student>minBy_Example(){

        Optional<Student> collect = StudentDataBase.getAllStudents()
                .stream()
                .collect(minBy(Comparator.comparing(Student::getGpa)));


     return collect;
    }
    public static void main(String[] args) {
        System.out.println(minBy_Example());
    }
}
