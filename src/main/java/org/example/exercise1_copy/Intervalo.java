package org.example.exercise1_copy;

public class Intervalo {
    public int start;
    public int end;

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public Intervalo(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int length(){
        return end - start;
    }
}
