package com.food.ordering.system.streams_terminal;

import com.food.ordering.system.data.Student;
import com.food.ordering.system.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsJoiningExample {
    public static String joining_1(){
       return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
               .peek(student-> System.out.println(student))
                .collect(Collectors.joining(", ","( "," )"));
    }

    public static void main(String[] args) {
        System.out.println(" Joining "+joining_1());
    }
}
