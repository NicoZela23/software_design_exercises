package org.example.exerciseDay;
public class PrintFives {
    public void printFives(NumberGenerator numberGenerator) {
        for (Integer number : numberGenerator.numberGenerator()) {
            if (number % 5 == 0) {
                System.out.println(number);
            }
        }
    }
}
