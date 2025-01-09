package com.food.ordering.system.streams;

import com.food.ordering.system.data.Student;
import com.food.ordering.system.data.StudentDataBase;

import java.util.List;

public class StreamsMapExample {
    public static List<String>nameList(){
        List<String> list = StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .toList();
        return list;
    }
    public static void main(String[] args) {
        System.out.println(nameList());
    }
}
