package com.simso.bronze.bronze2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main_2577 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int result = A * B * C;

        String x =  String.valueOf(result);
        String[] arr = x.split("");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }





    }
}