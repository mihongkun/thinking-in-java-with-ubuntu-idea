package com.mihk.ch03;

import java.util.Optional;

public class URShift {
    public static void main(String[] args) {
        int i = -1;
        System.out.println(Integer.toBinaryString(i));
        i>>>=10;
        System.out.println(Integer.toBinaryString(i));
        long l = -1L;
        System.out.println(Long.toBinaryString(l));
        l >>>=10;
        System.out.println(Long.toBinaryString(l));

        short s = -1;
        System.out.println(short2Bin(s));
    }

    public static String short2Bin(short s) {
        return Integer.toBinaryString(s);
    }
}
