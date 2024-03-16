package org.example.design2;

import java.util.*;

public class CombinedSorter implements ISorter {
    private final ISorter nameSorter;
    private final ISorter numericSorter;

    public CombinedSorter() {
        this.nameSorter = new SortByName();
        this.numericSorter = new SortByName();
    }
    @Override
    public List<Student> sort(List<Student> list) {
        List<Student> sortedByName = nameSorter.sort(list);
        return sortCombined(sortedByName);
    }
    private List<Student> sortCombined(List<Student> students) {
        int i = 0;
        while (i < students.size()) {
            int j = i + 1;
            while (j < students.size() && students.get(j).getName().equals(students.get(i).getName())) {
                j++;
            }
            List<Student> subList = students.subList(i, j);
            numericSorter.sort(subList);
            i = j;
        }
        return students;
    }
}
