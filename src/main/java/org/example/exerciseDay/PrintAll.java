package org.example.exerciseDay;
public class PrintAll {
    public void printAllNumbers(NumberGenerator numberGenerator){
        for (Integer number : numberGenerator.numberGenerator()) {
            System.out.println(number);
        }
    }
}
