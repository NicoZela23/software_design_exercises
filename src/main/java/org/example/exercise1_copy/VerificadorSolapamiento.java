package org.example.exercise1_copy;

public class VerificadorSolapamiento {
    public static boolean isOverlap(Intervalo a, Intervalo b) {
        return isOverlapping(a, b) || isOverlapping(b, a);
    }

    private static boolean isOverlapping(Intervalo a, Intervalo b) {
        return isInRange(a.getStart(), b) || isInRange(a.getEnd(), b);
    }

    private static boolean isInRange(int point, Intervalo interval) {
        return point >= interval.getStart() && point <= interval.getEnd();
    }
}

