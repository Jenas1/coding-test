package com.simso.bronze.bronze3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main_4153 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        ArrayList<String> list = new ArrayList<>();
        Boolean is = true;


        while (is) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a == 0 && b ==0 ){
                is = false;
            } else if(a > b){
                list.add("Yes");
            }else{
                list.add("No");
            }
        }

        list.forEach(s-> System.out.println(s));

    }
}