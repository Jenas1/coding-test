package com.simso.baekjoon.bronze.bronze2;

import java.io.*;
import java.util.StringTokenizer;

public class Main_2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] array = new int[8];
        String result = null;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < array.length - 1; i++) {
            if(array[i+1] == array[i] + 1){
                result = "ascending";

            }else if(array[i +1] == array[i]-1 ){
                result = "descending";
            }else {
                result = "mixed";
                break;
            }
        }
        bw.write(result);
        bw.flush();
        bw.close();
    }
}
