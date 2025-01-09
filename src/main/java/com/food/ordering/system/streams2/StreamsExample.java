package com.food.ordering.system.streams2;

import com.food.ordering.system.data.Student;
import com.food.ordering.system.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        Predicate<Student> studentPredicate=student -> student.getGradeLevel() >= 3;
        Predicate<Student> getGpa= student -> student.getGpa()>=3.9;

        //Student name and their activities in a map.
        var stringListMap = StudentDataBase.getAllStudents().stream()
                .peek((student -> {System.out.println(student);}))
                .filter(studentPredicate)
                .filter(getGpa)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        var collect = StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel() >= 3
                ).filter(getGpa).collect(Collectors.toMap(Student::getName, Student::getGpa));


        System.out.println(stringListMap);
        System.out.println(collect);
    }
}
