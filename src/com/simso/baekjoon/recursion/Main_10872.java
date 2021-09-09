package com.simso.baekjoon.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main_10872 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        Long N  = Long.parseLong(br.readLine());
        Long B  = Long.parseLong(br.readLine());

        Long result = test(N,B);

        System.out.println(result);
    }



    public static Long test(Long a, Long b){
        Long testt = 0L;

        for (int i = 0; i <= b; i++) {
            testt +=  (a * a);
        }


        return testt;
    }
}
