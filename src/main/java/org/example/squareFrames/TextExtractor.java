package org.example.squareFrames;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;

public class TextExtractor {

    private static final String FILENAME = "src/main/java/org/example/squareFrames/example - Ivan2.txt";

    public static char[][] readMatrixFromFile() {
        char[][] matrix = new char[20][50];
        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            int row = 0;
            while ((line = br.readLine()) != null && row < 20) {
                char[] chars = line.toCharArray();
                System.arraycopy(chars, 0, matrix[row], 0, Math.min(chars.length, 50));
                row++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return matrix;
    }

    public static void printMatrix(char[][] matrix) {
        for (int row = 0; row < 20; row++) {
            for (int col = 0; col < 50; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}
