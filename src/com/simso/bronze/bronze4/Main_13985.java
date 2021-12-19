package com.simso.bronze.bronze4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_13985 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String[] arr  = str.split(" ");

        int x = Integer.parseInt(arr[0]);
        int y = Integer.parseInt(arr[2]);
        int result = Integer.parseInt(arr[4]);


        if((x + y) == result){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }





        br.close();
    }

}



