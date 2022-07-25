package com.simso.baekjoon.bronze.bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_3003 {

    public static void main(String arg[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());


        int chess[] = new int[]{1, 1, 2, 2, 2, 8};


        for (int i = 0; i < 6; i++) {

            int piece = Integer.parseInt(st.nextToken());


            System.out.print(chess[i] - piece + " ");
        }

    }


}
