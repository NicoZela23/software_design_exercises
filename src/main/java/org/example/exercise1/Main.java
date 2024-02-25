package org.example.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int x = sumIntervals(new int[][]{{-245, -218}, {-194, -179}, {-155, -119}});
        System.out.println(x);
    }

    public static int sumIntervals(int[][] intervalsArray) {
        ParserIntervalo parserInterval = new ParserIntervalo();
        List<Intervalo> intervals = parserInterval.parseIntervaloCompuesto(intervalsArray);
        intervals.sort((a, b) -> Integer.compare(a.getStart(), b.getStart()));

        VerificadorSolapamiento overlapChecker = new VerificadorSolapamiento();
        FucionadorIntervalos intervalFusion = new FucionadorIntervalos();

        List<Intervalo> mergedIntervals = new ArrayList<>();

        for (Intervalo interval : intervals) {
            boolean merged = false;
            for (int i = 0; i < mergedIntervals.size(); i++) {
                Intervalo mergedInterval = mergedIntervals.get(i);
                if (overlapChecker.isOverlap(mergedInterval, interval)) {
                    Intervalo newInterval = intervalFusion.fucionar(mergedInterval, interval);
                    mergedIntervals.set(i, newInterval);
                    merged = true;
                    break;
                }
            }
            if (!merged) {
                mergedIntervals.add(interval);
            }
        }
        int totalLength = 0;
        for (Intervalo interval : mergedIntervals) {
            totalLength += interval.length();
        }
        return totalLength;
    }
}
