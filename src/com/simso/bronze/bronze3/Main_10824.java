package com.simso.bronze.bronze3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main_10824 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] str = new String[4];

        for (int i = 0; i < str.length; i++) {

            str[i]  = st.nextToken();
        }
        String a = str[0] + str[1];
        String b = str[2] + str[3];

        long c = Long.parseLong(a);
        long d = Long.parseLong(b);

        long result = c + d;
        System.out.println(result);



    }
}