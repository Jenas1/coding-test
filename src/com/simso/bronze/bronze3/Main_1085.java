package com.simso.bronze.bronze3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main_1085 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

       int x = Integer.parseInt(st.nextToken());
       int y = Integer.parseInt(st.nextToken());
       int w = Integer.parseInt(st.nextToken());
       int h = Integer.parseInt(st.nextToken());

       int[] arr = new int[]{x , y, w-x, h-y};

       Arrays.sort(arr);

       System.out.println(arr[0]);

    }
}