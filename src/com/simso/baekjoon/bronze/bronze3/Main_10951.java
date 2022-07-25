package com.simso.baekjoon.bronze.bronze3;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main_10951 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String s = "";

        ArrayList<Integer> list = new ArrayList<Integer>();

        while ((s = br.readLine()) != null) {
            st = new StringTokenizer(s, " ");

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            list.add(A + B);

        }

        list.forEach(n -> System.out.println(n));

    }
}