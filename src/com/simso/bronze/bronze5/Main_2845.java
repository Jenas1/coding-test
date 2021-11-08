package com.simso.bronze.bronze5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2845 {

    public static void main(String args[]) throws Exception {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int L = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int person = L * P;

        while (st1.hasMoreTokens()) {
            int input  = Integer.parseInt(st1.nextToken());
            int result = input - person;
            System.out.print(result+" ");
        }


    }
}

