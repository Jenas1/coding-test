package com.simso.bronze.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10809 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        String inputValue = br.readLine();

        char[] str = new char[inputValue.length()];

        for (int i = 0; i < inputValue.length(); i++) {

            str[i] = inputValue.charAt(i);

        }

        int [] result = new int[chars.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }


        for (int i = 0; i < chars.length; i++) {

            for (int j = 0; j < str.length; j++) {

                if(chars[i] == str[j]){
                    result[i] = j;
                    break;
                }
            }

        }

        for (int r: result) {
            System.out.println(r);
        }

    }
}