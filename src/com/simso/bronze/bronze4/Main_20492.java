package com.simso.bronze.bronze4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_20492 {
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int reward  =  Integer.parseInt(br.readLine());

        System.out.println((reward  * 100) /22 );


    }
}
