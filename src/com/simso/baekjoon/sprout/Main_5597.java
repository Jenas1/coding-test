package com.simso.baekjoon.sprout;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_5597 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] array = new boolean[30];

        for (int i = 0; i < 28; i++) {
            array[Integer.parseInt(br.readLine()) - 1] = true;

        }

        for (int i = 0; i < array.length; i++) {
            if(!array[i]) {
                System.out.println(i+1);
            }
        }
    }

}
