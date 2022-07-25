package com.simso.baekjoon.bronze.bronze4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main_2048 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int diceEyes1 = Integer.parseInt(st.nextToken());
        int diceEyes2 = Integer.parseInt(st.nextToken());
        int diceEyes3 = Integer.parseInt(st.nextToken());
        int reward;
        if (diceEyes1 == diceEyes2 && diceEyes2 == diceEyes3) {

            reward = 10000 + diceEyes1 * 1000;

        } else if (diceEyes1 == diceEyes2 || diceEyes1 == diceEyes3) {
            reward = 1000 + diceEyes1 * 100;

        } else if (diceEyes2 == diceEyes3) {
            reward = 1000 + diceEyes2 * 100;
        } else {
            reward = Math.max(Math.max(diceEyes1, diceEyes2), diceEyes3) * 100;
        }

        System.out.println(reward);
        br.close();
    }


}


