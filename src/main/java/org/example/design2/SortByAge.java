package org.example.design2;

import java.util.Comparator;

public class SortByAge extends SortByNumericAttribute{
    public SortByAge() {
        super(Comparator.comparing(Student::getAge));
    }
}
