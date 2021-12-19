package com.simso.bronze.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_17362 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if(N % 1 == 0 || N % 9== 0){
            System.out.println("엄지");
        }
        else if(N % 2 == 0 || N % 8== 0){
            System.out.println("검지");
        }
        else if(N % 3 == 0 || N % 7== 0){
            System.out.println("중지 ");
        }
        else if(N % 4 == 0 || N % 6== 0){
            System.out.println("약지");
        }else
            System.out.println("새끼");

    }
}
