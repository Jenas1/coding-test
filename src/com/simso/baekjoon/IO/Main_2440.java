package com.simso.baekjoon.IO;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main_2440 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Function(N);

    }

    public static void Function(int n ){

        String star= "*";

        if(n == 0){
            return;
        }
        for (int i = 0; i < n; i++) {

            System.out.print(star);

        }
        System.out.println();


        Function(n - 1);
    }
}

