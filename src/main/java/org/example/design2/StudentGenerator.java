package org.example.design2;

import java.util.ArrayList;
import java.util.List;

public class StudentGenerator {
    public List<Student> generateStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Javier Andrade",19,92.3));
        students.add(new Student("Ignacio Toledo",18,12.4));
        students.add(new Student("Gustavo Salinas",21,12.7));
        students.add(new Student("Ivan Peredo",22,13.13));
        students.add(new Student("Mario Aguilar",25,21.20));
        students.add(new Student("Salvador Pomar",30,100));
        students.add(new Student("Francisco Orellana",17,20.89));
        students.add(new Student("Ariel Cortez",19,35.9));
        students.add(new Student("Braulio Martinez",16,4));
        students.add(new Student("Dario Siñani",32,5.12));
        students.add(new Student("Cinda Flores",31,23.78));
        students.add(new Student("Norma Gutierrez",24,89.3));
        students.add(new Student("Marisol Muñoz",28,62.5));
        students.add(new Student("Cecilia Gimenez",29,8.2));
        students.add(new Student("Allison Zubieta",58,11.2));
        students.add(new Student("Genesis Corso",12,0));
        students.add(new Student("Burlecot Corso",35,17.8));
        students.add(new Student("Imperius Flores",32,18.23));
        students.add(new Student("Lautaro Garcia",41,71.2));
        students.add(new Student("Noelia Balderrama",40,42.8));
        students.add(new Student("Mariana Cuenca",21,100));
        return students;
    }
}
