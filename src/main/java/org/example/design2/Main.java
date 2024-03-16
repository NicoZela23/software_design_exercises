package org.example.design2;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new CombinedSorter().sort(new StudentGenerator().generateStudents());

        for (Student student : students){
            System.out.println(student.toString());
        }
    }
}
