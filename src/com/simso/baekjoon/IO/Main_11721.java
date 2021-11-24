package com.simso.baekjoon.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_11721 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String N = br.readLine();


        for (int i = 0; i < N.length(); i++) {

            System.out.print(N.charAt(i));

            if (i % 10 == 9) {
                System.out.println();
            }
        }

    }
}
