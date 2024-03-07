package org.example.design2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByNumericAttribute implements SortStrategy {

    private final Comparator<Student> comparator;

    public SortByNumericAttribute(Comparator<Student> comparator) {
        this.comparator = comparator;
    }
    @Override
    public List<Student> sort(List<Student> students) {
        for (int i = 0; i < students.size() - 1; i++){
            for (int j = 0; j < students.size() - i - 1; j++){
                if (comparator.compare(students.get(j), students.get(j + 1)) > 0){
                    Collections.swap(students, j, j + 1);
                }
            }
        }
        return students;
    }
}
