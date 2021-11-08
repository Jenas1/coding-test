package com.simso.bronze.bronze5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_5554 {

    public static void main(String args []) throws  Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;

        int y ;
        int x ;

        for (int i = 0; i < 4; i++) {

            result  += Integer.parseInt(br.readLine());

        }

        x = result / 60 ;
        y = result % 60 ;

        System.out.println(x);
        System.out.println(y);


    }
}
