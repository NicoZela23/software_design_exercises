package org.example.exercise1;

public class VerificadorSolapamiento {
    public static boolean isOverlap (Intervalo a, Intervalo b){
        return a.getStart() >= b.getStart() && a.getStart() <= b.getEnd()
                || a.getEnd() >= b.getStart() && a.getEnd() <= b.getEnd()
                || b.getStart() >= a.getStart() && b.getStart() <= a.getEnd()
                || b.getEnd() >= a.getStart() && b.getEnd() <= a.getEnd();
    }
}
