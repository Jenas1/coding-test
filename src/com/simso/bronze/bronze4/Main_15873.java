package com.simso.bronze.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_15873 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] arr = str.split("");

        if (arr.length == 3) {
            if (arr[1].equals("1") && arr[2].equals("0")) {
                int A = Integer.parseInt(arr[0]);
                int B = Integer.parseInt(arr[1] + arr[2]);

                System.out.println(A + B);
            } else {
                int A = Integer.parseInt(arr[0] + arr[1]);
                int B = Integer.parseInt(arr[2]);

                System.out.println(A + B);
            }

        } else if (arr.length == 4) {
            int A = Integer.parseInt(arr[0] + arr[1]);
            int B = Integer.parseInt(arr[2] + arr[3]);

            System.out.println(A + B);

        } else {

            int A = Integer.parseInt(arr[0]);
            int B = Integer.parseInt(arr[1]);
            System.out.println(A + B);
        }


    }
}
