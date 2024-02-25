package org.example.exercise1;

public class FucionadorIntervalos {

    public Intervalo fucionar (Intervalo a, Intervalo b){
        int newStart = Math.min(a.getStart(), b.getStart());
        int newEnd = Math.max(a.getEnd(), b.getEnd());

        return new Intervalo(newStart, newEnd);
    }
}
