package com.food.ordering.system.streams;

import com.food.ordering.system.data.StudentDataBase;
import com.food.ordering.system.data.Student;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

 /*   public static void main(String[] args) {
        Map<String, String> collect = (Map) StudentDataBase.getAllStudents().stream().collect(Collectors.toMap(Student::getName, Student::getGender));
        System.out.println(collect);
    }*/
     public static void main(String[] args) {
        Predicate<Student>studentPredicate= (student -> student.getGradeLevel()>=3 );
        Predicate<Student>studentGpaPredicate = student -> student.getGpa()>= 3.9;


         Map<String, List<String>> stringListMap = StudentDataBase.getAllStudents().stream()
                 .peek((student -> System.out.println(student)))
                 .filter(studentPredicate)
                 .peek((student -> System.out.println(" After first filter "+student)))
                 .filter(studentGpaPredicate)
                 .peek((student -> System.out.println(" After Second filter "+student)))
                 .collect(Collectors.toMap(Student::getName, Student::getActivities));

         System.out.println(stringListMap);
     }
}
