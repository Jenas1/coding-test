package com.simso.baekjoon.bronze.bronze2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_8958 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        String[] str;
        int[] arr = new int[T];

        int count = 0;
        int reset = 0;

        for (int i = 0; i < T; i++) {

            str = br.readLine().split("");

            for (int j = 0; j < str.length; j++) {

                if (str[j].equals("O")) {


                    if (j > 0 && str[j - 1].equals("O")) {

                        count += (reset + 1);

                        reset ++;
                    } else {

                        reset ++;
                        count += 1;
                    }
                }else {
                    reset = 0;
                }
            }

            arr[i] = count;

            count = 0;
            reset = 0;

        }

        for (int result : arr) {

            System.out.println(result);
        }

    }
}