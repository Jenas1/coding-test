package com.simso.baekjoon.bronze.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2908 {
    public static void main(String[] args) throws IOException {

        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bw.readLine(), " ");

        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());
        int result = getBiggerNumber(sort(getArray(first)) , sort(getArray(second)));

        System.out.println(result);
    }

    public static int sort(int[] input) {

        int [] reverse = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            reverse[i] = input[input.length - (1 + i)];
        }

        return (reverse[0] * 100) + (reverse[1] * 10) + reverse[2];
    }

    public static int[] getArray(int value) {
        int[] array = new int[3];
        array[0] = value / 100;
        array[1] = (value % 100) / 10;
        array[2] = value % 10 ;

        return array;
    }

    public static int getBiggerNumber(int first , int second) {
        return Math.max(first, second);
    }
}
