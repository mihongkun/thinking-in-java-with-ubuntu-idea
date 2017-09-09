package com.mihk.ch03;

class Letter {

    char c;
}

public class PassObject {
    static void f(Letter y) {
        y.c = 'z';

    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1: x.c \t" + x.c);
        f(x);
        System.out.println("2: x.c \t" + x.c);
        int i = 10;
        int j = 5;
        System.out.println(i * -j);


    }
}
