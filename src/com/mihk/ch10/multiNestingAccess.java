package com.mihk.ch10;

class MNA {
    private void f(){}
    class A {
        private void g(){}
        public class B {
            void h(){
                g();
                f();
            }
        }
    }

}

public class multiNestingAccess {
    public static void main(String[] args) {
        MNA mna= new MNA();
        MNA.A mnaa = mna.new A();
        MNA.A.B mnaab = mnaa.new B();
        mnaab.h();
    }
}
