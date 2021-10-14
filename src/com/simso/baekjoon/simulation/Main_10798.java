package com.simso.baekjoon.simulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_10798 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[][] str = new String[5][15];

        for (int i = 0; i < str.length; i++) {

            String input = br.readLine();

            for (int j = 0; j < input.length(); j++) {

                str[i][j] = input.substring(j , j + 1);
            }
        }

        for (int i = 0; i < 15; i++) {

            for (int j = 0; j < 5; j++) {

                if(str[j][i]==" "|| str[j][i] == null) {
                    continue;
                }

                System.out.print(str[j][i].trim());
            }
        }





    }


}

