package com.simso.bronze.bromze4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10707 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        int P = Integer.parseInt(br.readLine());

        int x = P * A;

        int y = B;

        if (P > C) {
            y = B + ((P - C) * D);
        }

        if (x <= y) {
            System.out.println(x);
        } else if (y < x) {
            System.out.println(y);
        }

        br.close();
    }

}



