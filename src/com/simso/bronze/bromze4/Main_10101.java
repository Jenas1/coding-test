package com.simso.bronze.bromze4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_10101 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int z = Integer.parseInt(br.readLine());

        if(x == 60 && y == 60 && z==60){
            System.out.println("Equilateral");
        }
        else if(x + y + z == 180 &&  (x==y || x==z || y==z) ){

            System.out.println("Isosceles");
        } else if(x + y + z == 180 &&  (x!=y || x!=z || y!=z) ){

            System.out.println("Scalene");
        }else {
            System.out.println("Error");
        }
        br.close();
    }
}



