package com.mihk.ch10;

public class TestBed {

    public void f(){
        System.out.println("f()");
    }
    public static class Tester{
        public static void main(String[] args) {
            new TestBed().f();
        }
    }

}
