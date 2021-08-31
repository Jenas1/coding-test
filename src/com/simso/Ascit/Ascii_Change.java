package com.simso.Ascit;

import java.util.Scanner;

public class Ascii_Change {

    public static void main(String[] args) throws Exception{


        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] d = new int[26];

        for(int i =0 ; i<str.length(); i++) {
            int a = str.charAt(i)-97;
            System.out.println(a);
            d[a]++;
        }

        for(int i =0 ; i<26; i++) {
            System.out.print(d[i]+"");
        }

    }
}
