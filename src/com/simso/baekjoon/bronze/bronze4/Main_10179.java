package com.simso.baekjoon.bronze.bronze4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_10179 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        double[] array = new double[T];

        for (int i = 0; i < array.length; i++) {
            array[i] = Double.parseDouble(br.readLine()) * 0.8;

        }

        for (double n: array) {
            System.out.println("$"+ String.format("%.2f", n));

        }
        br.close();
    }
}


