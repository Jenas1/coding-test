package com.simso.bronze.bromze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_15726 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // int로 하니깐 안된다 문제를 잘읽자!
        double a = Integer.parseInt(st.nextToken());
        double b = Integer.parseInt(st.nextToken());
        double c = Integer.parseInt(st.nextToken());

        int result1 = (int) (a * b / c);
        int result2 = (int) (a / b * c);

        System.out.println(Math.max(result1, result2));
    }
}
