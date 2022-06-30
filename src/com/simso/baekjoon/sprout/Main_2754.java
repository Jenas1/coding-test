package com.simso.baekjoon.sprout;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_2754 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputValue = br.readLine();
        char result1 = inputValue.charAt(0);

        if (result1 == 'A') {
            char result2 = inputValue.charAt(1);
            double v = 4.0 + secondValue(result2);

            bw.write(String.valueOf(v));
        } else if (result1 == 'B') {
            char result2 = inputValue.charAt(1);

            double v = 3.0 + secondValue(result2);

            bw.write(String.valueOf(v));
        } else if (result1 == 'C') {
            char result2 = inputValue.charAt(1);

            double v = 2.0 + secondValue(result2);

            bw.write(String.valueOf(v));

        } else if (result1 == 'D') {
            char result2 = inputValue.charAt(1);

            double v = 1.0 + secondValue(result2);

            bw.write(String.valueOf(v));

        } else if (result1 == 'F') {
            bw.write(String.valueOf(0.0));
        }

        bw.flush();
        bw.close();

    }

    public static Double secondValue(char value) {
        Double secondValue = 0.0;
        if (value == '+') {
            secondValue = 0.3;
        } else if (value == '-') {
            secondValue = -0.3;
        }
        return secondValue;
    }
}
