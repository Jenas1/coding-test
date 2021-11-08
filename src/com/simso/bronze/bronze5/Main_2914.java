package com.simso.bronze.bronze5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2914 {

    public static void main(String arg[]) throws Exception{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int I = Integer.parseInt(st.nextToken());

        int result = (I-1) * A;

        System.out.println(result+1);
        
        // I 값은 23<I < 24  때문에 1더해줘야함
    }
}
