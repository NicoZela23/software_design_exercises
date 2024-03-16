package org.example.squareFrames;

public class StringToMatrix {
    public static char[][] stringToCharMatrix(String str) {
        int rows = (int) Math.ceil(Math.sqrt(str.length()));
        char[][] matrix = new char[rows][];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            int cols = Math.min(str.length() - index, rows);
            matrix[i] = new char[cols];
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = str.charAt(index++);
            }
        }
        return matrix;
    }


}
