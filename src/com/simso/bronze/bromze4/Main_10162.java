package com.simso.bronze.bromze4;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main_10162 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int A = 300;
        int B = 60;
        int C = 10;

        int[] count = new int[3];
        int n = T;

        if (T >= A) {
            count[0] = T / A;
            n = T % A;
        }
        if (n >= B) {
            count[1] = n / B;
            n = T % B;
        }
        if (n >= C) {
            count[2] = n / C;
            n = T % C;
        }
        if (n != 0) {
            System.out.println(-1);
        } else {
            for (int array : count) {
                System.out.println(array);
            }
        }
        br.close();
    }

}
