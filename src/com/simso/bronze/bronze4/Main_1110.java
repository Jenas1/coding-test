package com.simso.bronze.bronze4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1110 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;
        int p = n;

        //수연결
        while (true) {
            n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);

            count++;


            if(n == p){
               break;
           }
        }

        System.out.println(count);
        br.close();
    }

}



