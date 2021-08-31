package com.simso.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main_14681 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        if(x >0){
            if(y > 0){
                System.out.println(1);
            }
            else{
                System.out.println(4);
            }
        }
        if(x < 0){
            if(y > 0){
                System.out.println(2);
            }
            else{
                System.out.println(3);
            }
        }
    }
}
