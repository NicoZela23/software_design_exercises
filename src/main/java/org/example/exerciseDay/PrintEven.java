package org.example.exerciseDay;
public class PrintEven {
    public void printEvenNumbers(NumberGenerator numberGenerator) {
        for (Integer number : numberGenerator.numberGenerator()) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
