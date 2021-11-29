package com.simso.baekjoon.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11720 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String A = (br.readLine());

        int[] array = new int[N];
        int sum = 0;


        for (int i = 0; i < array.length; i++) {
            array[i] =  Integer.parseInt(String.valueOf(A.charAt(i)));

            sum = array[i];
        }

        System.out.println(sum);

    }
}
