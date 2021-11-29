package com.simso.baekjoon.IO.modelAnswer;

import java.util.Scanner;

public class Main_2443_modelAnswer {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = n - 1; i > -n; i--) {
            for (int k = 0; k < n - Math.abs(i); k++) System.out.print("*");
            for (int j = 0; j < Math.abs(i) * 2; j++) System.out.print(" ");
            for (int k = 0; k < n - Math.abs(i); k++) System.out.print("*");
            System.out.println();
        }
    }
}