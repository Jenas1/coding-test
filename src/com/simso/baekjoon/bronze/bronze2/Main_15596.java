package com.simso.baekjoon.bronze.bronze2;

public class Main_15596 {


    public static long sum(int[] a) {
        long count = 0;
        for (int i : a) {
            count += i;
        }
        return count;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(sum(new int[] {1,2,4}));
    }
}
