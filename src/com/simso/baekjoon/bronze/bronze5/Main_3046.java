package com.simso.baekjoon.bronze.bronze5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_3046 {

    public static void main(String arg[]) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int R1 = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());



        // S = (R1 + R2)/2;

        int R2 = (2 * S) - R1;

        System.out.println(R2);

        br.close();

    }


}
