package com.simso.baekjoon.bronze.bronze3;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main_10817 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] array = new int[3];
        int n;
        for (int i = 0; i < 3; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-i -1; j++) {
                if(array[j] > array[j +1]){
                    n = array[j];
                    array[j] = array[j+1];
                    array[j+1] = n;
                }
            }
        }
        System.out.println(array[1]);
    }
}