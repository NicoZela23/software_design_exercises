package org.example.squareFrames;

public class CornerFinder {

    public static int[] findQuestionMarkCoordinates(String frame) {
        int width = 50;
        int height = 20;

        int[] coordinates = new int[]{-1, -1};

        for (int i = 0; i < frame.length(); i++) {
            char c = frame.charAt(i);
            if (c == '?') {
                coordinates[0] = i % width;
                coordinates[1] = i / width;
                break;
            }
        }

        return coordinates;
    }
}
