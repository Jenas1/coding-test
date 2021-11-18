package com.simso.bronze.bromze4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main_11948 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int res = (a / 10) + (a % 10);

        if (a / 10 > 10) {
            res = (a / 100) + (a % 100);
        }
        if (a == 1010) {
            res = 20;
        }

        System.out.println(res);

    }


}


