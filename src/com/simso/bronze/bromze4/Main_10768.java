package com.simso.bronze.bromze4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_10768 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

         if(m == 1 || (m == 2 && d < 18)){
             System.out.println("Before");

         }else if(m ==2 && d ==18){
             System.out.println("Special");
         }else {
             System.out.println("After");
         }



        br.close();
    }

}



