package org.example.exerciseDay;
public class PrintOdds {
    public void printOdds(NumberGenerator numberGenerator) {
        for (Integer number : numberGenerator.numberGenerator()) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }
}
