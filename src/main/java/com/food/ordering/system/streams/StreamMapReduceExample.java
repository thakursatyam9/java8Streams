package com.food.ordering.system.streams;

import com.food.ordering.system.data.Student;
import com.food.ordering.system.data.StudentDataBase;

public class StreamMapReduceExample {
    private static int noOfNotebooks(){
        Integer totalNoOfNotebooks = StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel()>=3)//Stream <Student>
                .filter(s->s.getGender().equals("female"))
                .map(Student::getNoteBooks) //Stream<Integer>
             //   .reduce(0, (a, b) -> a + b);
                .reduce(0,Integer::sum);
        return totalNoOfNotebooks;
    }
    public static void main(String[] args) {
        System.out.println(noOfNotebooks());
    }
}
