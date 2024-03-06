package org.example.exerciseDay;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        numberGenerator.numberGenerator();

        printAll(numberGenerator);
        printEven(numberGenerator);
        printOdds(numberGenerator);
        printFives(numberGenerator);
    }

    public static void printAll(NumberGenerator numberList){
        System.out.println("All List");
        PrintAll printAll = new PrintAll();
        printAll.printAllNumbers(numberList);
    }

    public static void printEven(NumberGenerator numberList){
        System.out.println("Even List");
        PrintEven printEven = new PrintEven();
        printEven.printEvenNumbers(numberList);
    }

    public static void printOdds(NumberGenerator numberList){
        System.out.println("Odd List");
        PrintOdds printOdd = new PrintOdds();
        printOdd.printOdds(numberList);
    }
    public static void printFives(NumberGenerator numberList){
        System.out.println("Five List");
        PrintFives printFives = new PrintFives();
        printFives.printFives(numberList);
    }
}

