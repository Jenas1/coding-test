package com.simso.baekjoon.bronze.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_5532 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());

        int result1 = 0;
        int result2 = 0;

        if( A % C == 0){

            result1 = A / C;
        }else {
            result1 = A/C +1;

        }
        if( B % D == 0){

            result2 = B / D;
        }else {
            result2 = B/D +1;
        }

        int max = result1 > result2 ? result1: result2;

        System.out.println(L - max);


    }
}
