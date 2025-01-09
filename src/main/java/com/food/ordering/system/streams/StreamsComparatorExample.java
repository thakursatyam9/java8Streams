package com.food.ordering.system.streams;

import com.food.ordering.system.data.Student;
import com.food.ordering.system.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamsComparatorExample {
    public static List<Student> sortStudentByName(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName).reversed())
                .collect(toList());
    }
    public static List<Student> sortStudentByGPA(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .toList();
    }
    public static void main(String[] args) {
        System.out.println(sortStudentByName());
        System.out.println();
        System.out.println(sortStudentByGPA());

    }
}
