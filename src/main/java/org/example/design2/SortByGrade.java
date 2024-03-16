package org.example.design2;

import java.util.Comparator;

public class SortByGrade extends SortByNumericAttribute{
    public SortByGrade() {
        super(Comparator.comparing(Student::getGrade));
    }
}
