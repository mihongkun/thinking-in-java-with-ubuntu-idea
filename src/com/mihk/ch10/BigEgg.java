package com.mihk.ch10;

public class BigEgg{
    public class Yolk {
        public Yolk() {
            System.out.println("BigEgg.Yolk()");
        }
    }

    public static void main(String[] args) {
        new BigEgg().new Yolk();
    }
}
