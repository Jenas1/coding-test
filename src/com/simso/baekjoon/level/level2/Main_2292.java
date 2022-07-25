package com.simso.baekjoon.level.level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2292 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int b = N - 1;

        while (b > count * 6) {
            b = b - (count * 6);
            count ++;
        }
        System.out.print(N != 1 ? count + 1 : 1);
    }
}
