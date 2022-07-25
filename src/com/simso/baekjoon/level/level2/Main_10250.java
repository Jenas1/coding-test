package com.simso.baekjoon.level.level2;

import java.io.*;
import java.util.StringTokenizer;

public class Main_10250 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int H = Integer.parseInt(st.nextToken());
            st.nextToken();
            int N = Integer.parseInt(st.nextToken());

            getRoom(H, N);
        }

        String test = "test";

        int test1 = test.indexOf("test");
    }

    public static void getRoom(int N, int H){
        StringBuilder sb = new StringBuilder();

        int Y;
        int X;

        if(N % H == 0) {
            Y = H * 100;
            X = N/H;
            System.out.println(X + Y);

        }else {
            Y = (N % H) * 100;
            X = (N/H) + 1;
            System.out.println(X + Y);
        }
    }
}
