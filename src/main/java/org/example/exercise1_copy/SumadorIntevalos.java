package org.example.exercise1_copy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SumadorIntevalos {
    public static int sumIntervals(int[][] intervalsArray) {
        List<Intervalo> intervals = parseAndSortIntervals(intervalsArray);
        List<Intervalo> mergedIntervals = mergeOverlappingIntervals(intervals);
        return calculateTotalLength(mergedIntervals);
    }

    private static List<Intervalo> parseAndSortIntervals(int[][] intervalsArray) {
        ParserIntervalo parserInterval = new ParserIntervalo();
        List<Intervalo> intervals = parserInterval.parseIntervaloCompuesto(intervalsArray);
        intervals.sort(Comparator.comparingInt(Intervalo::getStart));
        return intervals;
    }

    private static List<Intervalo> mergeOverlappingIntervals(List<Intervalo> intervals) {
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
        return mergedIntervals;
    }

    private static int calculateTotalLength(List<Intervalo> intervals) {
        int totalLength = 0;
        for (Intervalo interval : intervals) {
            totalLength += interval.length();
        }
        return totalLength;
    }
}
