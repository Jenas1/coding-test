package com.simso.baekjoon.bronze;

public class Main {
    public static void main(String args[]) {

        int[] array  ={ 3 , 5 ,1};

        int b;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length -i -1; j++) {
                if(array[j]> array[j+1]){
                    b = array[j];
                    array[j] = array[j +1];
                    array[j+1] = b;

                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
