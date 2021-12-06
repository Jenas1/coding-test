package com.simso.bronze.bronze4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11943 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        int[] box = new int[2];
        int[] box2 = new int[2];

        for (int i = 0; i < 2; i++) {
            box[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < 2; i++) {
            box2[i] = Integer.parseInt(st2.nextToken());
        }

        int a = box[0] + box2[1];
        int b = box[1] + box2[0];

        if (a >= b) {
            System.out.println(b);
        } else if (a < b) {
            System.out.println(a);
        }
        br.close();
    }

}



