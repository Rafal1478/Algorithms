package Timer;

import limplists.ArrayList2x;
import limplists.IList;
import limplists.ListUtilities;

import javax.swing.*;
import java.util.Random;

public class SortExaminator {
    public static void main(String[] args) {
        IList<Integer> list = new ArrayList2x<>();
        Random rand = new Random();
        StopWatch stopwatch = new StopWatch();
        int randomBound = 100;
        int[] elementNumberOf = new int[]{100, 1000, 5000};
        long[] results = new long[elementNumberOf.length];
        int repetitions = 100;
        for (int i = 0; i < elementNumberOf.length; i++) {
            for(int repetition = 0; repetition < repetitions; repetition++ ) {
                list = new ArrayList2x<>();
                for (int j = 0; j < elementNumberOf[i]; j++)
                    list.add(rand.nextInt(randomBound));
                stopwatch.start();
                ListUtilities.insertSort(list);
                results[i] += stopwatch.stop();
            }
            results[i] /= repetitions;
        }
        for (long time : results)
            System.out.print(time + " ");
        }
    }

