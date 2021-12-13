package com.simso.bronze.bronze2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;


public class Main_2562 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int[] arr = new int[9];
        List<Integer> index = new ArrayList<Integer>();
        int b;


        for (int i = 0; i < arr.length; i++) {
            int input = Integer.parseInt(br.readLine());
            arr[i] = input;
            index.add(input);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length -i - 1; j++) {
                    if(arr[j] > arr[j+1]){
                        b = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = b;
                    }
            }

        }
        int result = arr[arr.length -1];

        int resultIndex = Arrays.asList(index).indexOf(result);


        bw.write(String.valueOf(result));
        bw.newLine();
        bw.write(String.valueOf(resultIndex));

        bw.flush();
        bw.close();
        br.close();
    }


}