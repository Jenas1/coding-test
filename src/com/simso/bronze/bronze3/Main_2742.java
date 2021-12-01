package com.simso.bronze.bronze3;

import java.io.*;


public class Main_2742 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        br.close();

        function(N);

    }

    public static void function(int N) {

        if (N == 0) {
            return;
        }
        System.out.println(N);

        function(N - 1);

    }
}