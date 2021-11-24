package com.simso.bronze.bromze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_13866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int[] arr = new int[4];
        int sum = 0;

        for (int i = 0; i < 4; i++) {

            arr[i] = Integer.parseInt(st.nextToken());

        }

        for (int a : arr) {
            sum += a;
        }

        int team1 = (arr[0] + arr[arr.length - 1]);
        int team2 = sum - team1;
        int result = team1 - team2;

        System.out.println(Math.abs(result));

    }
}
