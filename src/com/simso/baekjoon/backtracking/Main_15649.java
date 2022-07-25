package com.simso.baekjoon.backtracking;

import java.util.Scanner;

public class Main_15649 {

    static int n;
    static int m;
    static int[] arr = new int[10];
    static boolean[] isused = new boolean[10];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        func(0);


    }

    static void func(int k) {
        if (k == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!isused[i]) {
                arr[k] = i;
                isused[i] = true;
                func(k + 1);
                isused[i] = false;
            }
        }

    }
}


