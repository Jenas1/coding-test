package com.simso.bronze.bronze4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_17388 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int Soongsil = Integer.parseInt(st.nextToken());
        int Korea = Integer.parseInt(st.nextToken());
        int Hanyang = Integer.parseInt(st.nextToken());

        if((Soongsil+ Korea+ Hanyang) >= 100 ){
            System.out.println("OK");
        }else {
            int result = Funtion(Soongsil,Korea,Hanyang);

            if(result == Soongsil){
                System.out.println("Soongsil");
            }else if(result == Korea){
                System.out.println("Korea");
            }else {
                System.out.println("Hanyang");
            }

        }

        br.close();
    }

    static int Funtion(int a, int b, int c){
        int arr[] = new int[]{a,b,c};
        int n ;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    n = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = n;
                }
            }
        }
        return arr[0];
    }
}