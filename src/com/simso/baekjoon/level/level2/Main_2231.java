package com.simso.baekjoon.level.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int N = Integer.parseInt(str);


        for (int i = 0; i < str.length(); i++) {
           N += Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        System.out.println(N);

    }
}
