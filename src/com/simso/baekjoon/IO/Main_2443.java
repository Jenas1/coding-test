package com.simso.baekjoon.IO;

import java.io.*;


public class Main_2443 {


    public static String star = "*";
    public static int N;


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        Function2(1, N);
        Function(N, 0);

    }

    public static void Function(int n, int m) {

        if (n == 0) {
            return;
        }
        for (int i = 0; i < n; i++) {

            System.out.print(star);

        }

        for (int i = 0; i < m; i++) {

            System.out.print(" ");

        }

        for (int i = 0; i < m; i++) {

            System.out.print(" ");

        }
        for (int i = 0; i < n; i++) {

            System.out.print(star);

        }


        System.out.println();

        Function(n - 1, m + 1);
    }

    public static void Function2(int n, int m) {

        if (n == N) {
            return;
        }
        for (int i = 0; i < n; i++) {

            System.out.print(star);

        }
        for (int i = 0; i < m-1; i++) {

            System.out.print(" ");

        }

        for (int i = 1; i < m; i++) {

            System.out.print(" ");

        }
        for (int i = 0; i < n; i++) {

            System.out.print(star);

        }
        System.out.println();

        Function2(n + 1, m - 1);
    }


}

