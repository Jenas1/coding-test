package com.simso.bronze.bromze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_5532 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");

        int s = 0;
        int t = 0;


        for (int i = 0; i < 4; i++) {
           s += Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < 4; i++) {
           t += Integer.parseInt(st1.nextToken());
        }
        if(s >= t){
            System.out.println(s);
        }
        else if(t > s){
            System.out.println(t);
        }




    }
}
