package com.simso.baekjoon.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main_2446 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());


        br.close();

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < i; j++) {

                bw.write(" ");
            }
            for (int j = 0; j < N-i; j++) {
                bw.write("*");
            }
            for (int j = 1; j < N-i; j++) {
                bw.write("*");
            }

            bw.newLine();
        }
        for (int i = 1; i < N; i++) {

            for (int j = 1; j < N-i; j++) {

                bw.write(" ");
            }
            for (int k = 1; k <= i; k++) {

                bw.write("*");
            }
            for (int j =0; j <= i; j++) {

                bw.write("*");
            }


            bw.newLine();
        }

        bw.flush();
        bw.close();

    }
}


