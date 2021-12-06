package com.simso.bronze.bronze4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_5543 {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] burger = new int[3];
        int[] drink = new int[2];

        for (int i = 0; i < 3; i++) {

                burger[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < 2; i++) {

            drink[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(burger);
        Arrays.sort(drink);

        int set = (burger[0] + drink[0]) - 50;

        System.out.println(set);

    }
}
