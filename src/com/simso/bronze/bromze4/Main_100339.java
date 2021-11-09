package com.simso.bronze.bromze4;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main_100339 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        for (int i = 0; i < 5; i++) {

            int input = Integer.parseInt(br.readLine());

            if (input < 40) {
                input = 40;
            }

            sum += input;

        }

        int average = sum / 5;

        System.out.println(average);

    }

}
