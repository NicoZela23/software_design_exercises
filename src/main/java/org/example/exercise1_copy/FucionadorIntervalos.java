package org.example.exercise1_copy;

public class FucionadorIntervalos {

    public Intervalo fucionar (Intervalo a, Intervalo b){
        return new Intervalo(Math.min(a.getStart(), b.getStart()), Math.max(a.getEnd(), b.getEnd()));
    }
}
