package com.mihk.ch15;

public class GenericMethods {
    public <T> void f(T x) {
        System.out.println(x.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f(" ");
        gm.f(1);
        gm.f(1.0);
        gm.f(' ');
        gm.f(1.0f);
        gm.f(gm);
        gm.f(new Byte("1"));
        gm.f(new Boolean("true"));
        gm.f(new Short("1"));
        gm.f(new Long("1"));
    }
}
