package com.simso.baekjoon.bronze.bronze3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main_4153 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int[] arr = new int[3];

            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());

            if(arr[0] ==0 && arr[1] == 0 && arr[2] == 0){
                break;
            }

            Arrays.sort(arr);

            double x = Math.pow(arr[0], 2);
            double y = Math.pow(arr[1], 2);
            double z = Math.pow(arr[2], 2);

            if ((x + y) == z) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }

        }


    }
}