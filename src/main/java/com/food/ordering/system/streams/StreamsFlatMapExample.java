package com.food.ordering.system.streams;

import com.food.ordering.system.data.Student;
import com.food.ordering.system.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {
    public static List<String> printStudentActivities(){
       List<String>studentActivities= StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)//Stream<List<String>
               .flatMap(List::stream)//Stream<String>
               .distinct()
               .sorted()
               .toList();
        return studentActivities;
    }
    public static void main(String[] args) {
        System.out.println("Print Student Activities "+ printStudentActivities() );
    }
}
