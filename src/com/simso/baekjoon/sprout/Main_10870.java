package com.simso.baekjoon.sprout;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_10870 {


    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int fibonacci = fibonacci(n);
        System.out.println(fibonacci);
    }

    public static int  fibonacci(int n) {

        if(n == 0 ) {
            return 0;
        }
        if( n == 1) {
            return  1;
        }


        return  fibonacci(n - 2) + fibonacci(n - 1);


    }

}
