package com.simso.baekjoon.sprout;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2744 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String result = br.readLine();

        char[] array = new char[result.length()];

        for (int i = 0; i < result.length(); i++) {
            if (65 <= result.charAt(i) && result.charAt(i) <= 90) {
                array[i] = (char) (result.charAt(i) + 32);
                continue;
            } else if (97 <= result.charAt(i) && result.charAt(i) <= 122) {

                array[i] = (char) (result.charAt(i) - 32);

                continue;

            }
        }

        for (char c : array) {
            System.out.print(c);
        }

    }
}
