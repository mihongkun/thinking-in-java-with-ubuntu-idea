package com.mihk.ch02;

import java.util.Date;

public class ShowProperties {

    private int hello;
    private char ch;



    public static void main(String[] args) {
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
        System.out.println("Hello," + new Date());
        System.out.println();
        System.getProperties().list(System.out);
        System.out.println(new ShowProperties().ch);
        System.out.println(new ShowProperties().hello);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(System.getProperty("user.dir"));
    }




}
