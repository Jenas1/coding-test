package com.simso.baekjoon.IO;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main_2441 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < N - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }


}

