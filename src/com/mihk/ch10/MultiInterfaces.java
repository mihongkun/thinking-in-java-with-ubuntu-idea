package com.mihk.ch10;

interface A {}

interface B {}

class X implements  A,B {}

class Y implements A {
    B makeB(){
        return new B(){};
    }
}

public class MultiInterfaces {
    static void takeA(A a) {}
    static void takeB(B b){}

    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        takeA(x);
        takeB(x);
        takeA(y);
        takeB(y.makeB());
    }
}
