package org.example.design2;

import java.util.ArrayList;
import java.util.List;

public class StudentGenerator {
    public List<Student> generateStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Javier Andrade",19,92.3));
        students.add(new Student("Javier Andrade",21,12.4));
        students.add(new Student("Javier Andrade",18,12.7));
        students.add(new Student("Ivan Peredo",26,13.13));
        students.add(new Student("Ivan Peredo",12,21.20));
        students.add(new Student("Ivan Peredo",1,100));
        students.add(new Student("Francisco Orellana",17,20.89));
        students.add(new Student("Francisco Orellana",19,35.9));
        students.add(new Student("Francisco Orellana",16,4));
        students.add(new Student("Dario Siñani",32,5.12));
        students.add(new Student("Dario Siñani",31,23.78));
        students.add(new Student("Dario Siñani",24,89.3));
        students.add(new Student("Marisol Muñoz",39,62.5));
        students.add(new Student("Marisol Muñoz",1,8.2));
        students.add(new Student("Marisol Muñoz",12,11.2));
        return students;
    }
}
