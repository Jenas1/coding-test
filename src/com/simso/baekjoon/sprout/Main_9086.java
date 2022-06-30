package com.simso.baekjoon.sprout;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main_9086 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i < T; i++){
            testCase(br.readLine());
        }
    }

    public static void testCase(String str) {
        char[] array = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            array[i] = str.charAt(i);
        }

        System.out.print(array[0]);
        System.out.print(array[array.length - 1]);
        System.out.println();
    }
}
