package com.simso.baekjoon.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main_10872 {

    public static Long sum = 1L;
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long N  = Long.parseLong(br.readLine());

        Long result = Function(N);

        System.out.println(result);
    }

    public static Long Function(Long N){

        if(N == 0){

            return sum;
        }
        sum *= N;

        return Function(N - 1);
    }
}
