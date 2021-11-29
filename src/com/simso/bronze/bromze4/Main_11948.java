package com.simso.bronze.bromze4;

import java.util.Scanner;

public class Main_11948 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String r = sc.next();

        int y = Character.getNumericValue(r.charAt(0));
        int x = Character.getNumericValue(r.charAt(1));

        System.out.println(x+y);
    }


}


