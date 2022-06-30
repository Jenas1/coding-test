package com.simso.baekjoon.level;

import java.util.Arrays;
import java.util.Scanner;

public class Main_1546 {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        int count = sc.nextInt();
        double result = 0;
        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        double M = Arrays.stream(array).max().getAsInt();

        for (int i : array) {
             result += Math.round(((i / M * 100) * 100)/ 100.0);
        }

        System.out.println(Math.round(result /count * 100) /100.0);

    }
}
