package com.simso.bronze.bronze2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main_2557 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[10];

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String result = String.valueOf(a * b * c);

        for (int i = 0; i < result.length(); i++) {
            arr[(result.charAt(i) -48)]++;
        }

        for (int d : arr) {
            bw.write(String.valueOf(d));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }


}