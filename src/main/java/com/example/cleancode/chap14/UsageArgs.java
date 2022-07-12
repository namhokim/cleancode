package com.example.cleancode.chap14;

import java.text.ParseException;

public class UsageArgs {
    public static void main(String[] args) throws ParseException {
        Args arg = new Args("l,p#,d*", args);
        boolean logging = arg.getBoolean('l');
        int port = arg.getInt('p');
        String directory = arg.getString('d');

        System.out.println(String.format("logging [%b] port [%d] directory [%s]", logging, port, directory));
    }
}
