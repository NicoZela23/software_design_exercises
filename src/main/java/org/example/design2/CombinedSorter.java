package org.example.design2;

import java.util.*;

public class CombinedSorter implements SortStrategy{
    private Map<String, SortStrategy> sortingStrategies;
    private List<Student> students;


    public CombinedSorter() {
        sortingStrategies = new HashMap<>();
        sortingStrategies.put("name", new SortByName());
        sortingStrategies.put("age", new SortByNumericAttribute(Comparator.comparing(Student::getAge)));
        sortingStrategies.put("grade", new SortByNumericAttribute(Comparator.comparing(Student::getGrade)));
    }

    @Override
    public List<Student> sort(List<Student> students) {
        return students;
    }

    public List<Student> combinedSort(String input, List<Student> students) {
        String[] criteria = input.split("\\s+");
        List<SortStrategy> strategies = new ArrayList<>();

        for (String criterion : criteria) {
            SortStrategy strategy = sortingStrategies.get(criterion.toLowerCase());
            if (strategy != null) {
                strategies.add(strategy);
            }
        }
        List<Student> sortedStudents = new ArrayList<>(students);
        for (SortStrategy strategy : strategies) {
            sortedStudents = strategy.sort(sortedStudents);
        }

        return sortedStudents;
    }
}
