package com.food.ordering.system.streams_terminal;

import com.food.ordering.system.data.Student;
import com.food.ordering.system.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamsMappingExample {
    public static void main(String[] args) {
      List<String>namesList = StudentDataBase.getAllStudents()
                .stream()
              .collect(mapping(Student::getName,toList()));

        Set<String> namesSet = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName,toSet()));

        System.out.println(" Names List : "+namesList);
        System.out.println(" Names Set : "+namesSet);
    }
}
