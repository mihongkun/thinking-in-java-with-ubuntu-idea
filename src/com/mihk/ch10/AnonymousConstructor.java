package com.mihk.ch10;


abstract class Base {
    public Base(int i){
        System.out.println("Base Constructor i= " +i);
    }
    public abstract void f();
}

public class AnonymousConstructor {

    public static Base getBean(int i){
        return new Base(i) {
            {
                System.out.println("Inside instance initializer");
            }
            @Override
            public void f() {
                System.out.println("In anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = AnonymousConstructor.getBean(47);
        base.f();
    }

}
