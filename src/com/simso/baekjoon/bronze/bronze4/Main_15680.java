package com.simso.baekjoon.bronze.bronze4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_15680 {
    public static void main(String args[]) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if(N == 0){
            System.out.println("YONSEI");
        }
        else {
            System.out.println("Leading the Way to the Future");

        }
        br.close();
    }
}
