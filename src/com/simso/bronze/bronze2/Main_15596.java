package com.simso.bronze.bronze2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

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
