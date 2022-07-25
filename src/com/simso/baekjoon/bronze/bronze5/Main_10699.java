package com.simso.baekjoon.bronze.bronze5;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;


public class Main_10699 {
    public static void main(String arg[]) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("YYYY-MM-dd");

        df.setTimeZone(TimeZone.getTimeZone("GET"));

        String time = df.format(date);

        bw.write(time);
        bw.flush();
        bw.close();


    }
}
