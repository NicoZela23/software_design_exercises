package org.example.design2;

import java.util.Comparator;
import java.util.List;

public class SortByName implements SortStrategy {
    @Override
    public List<Student> sort(List<Student> students) {
        students.sort(Comparator.comparing(Student::getName));
        return students;
    }
}
