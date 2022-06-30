package com.simso.baekjoon.sprout;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_10807 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] N = new int[Integer.parseInt(br.readLine())];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(br.readLine());

        for(int i = 0; i< N.length; i++) {
             N[i] = Integer.parseInt(st.nextToken());
        }

        int result = Arrays.binarySearch(N, V);

        System.out.println(result);
    }
}

