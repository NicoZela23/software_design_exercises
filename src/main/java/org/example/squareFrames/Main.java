package org.example.squareFrames;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        TextExtractor.printMatrix(TextExtractor.readMatrixFromFile());
    }
}
