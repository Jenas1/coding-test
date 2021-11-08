package com.simso.bronze.bronze5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main_10757 {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        BigInteger input1 = new BigInteger(st.nextToken());
        BigInteger input2 = new BigInteger(st.nextToken());

        System.out.println(input1.add(input2));

    }
}
