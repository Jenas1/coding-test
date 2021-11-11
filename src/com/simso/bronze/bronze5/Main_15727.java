package com.simso.bronze.bronze5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_15727 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        if (a % 5 == 0) {
            System.out.println(a / 5);
        } else {
            System.out.println((a / 5) + 1);
        }
    }
}
