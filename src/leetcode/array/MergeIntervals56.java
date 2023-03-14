package leetcode.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;

public class MergeIntervals56 {

    public static void main(String[] args) {

        int[][] arr = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        merge(arr);
        //[[1,6],[8,10],[15,18]]

        for (int[] ints : arr) {
            for (int anInt : ints) {

                System.out.print(anInt + " ");
            }

            System.out.println();
        }
    }


    public static int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> merged = new LinkedList<>();

        for (int[] interval : intervals) {

            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);

            } else {
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
