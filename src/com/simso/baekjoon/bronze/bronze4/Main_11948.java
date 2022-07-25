package com.simso.baekjoon.bronze.bronze4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_11948 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        int E = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());

        int[] arr = new int[]{A,B,C,D};
        int[] arr2 = new int[]{E,F};

        int result = Funtion(arr) + Funtion(arr2);

        System.out.println(result);

    }

    public static int Funtion(int[] arr ){
        Arrays.sort(arr);

        int sum = 0;


        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum - arr[0];
    }

}


