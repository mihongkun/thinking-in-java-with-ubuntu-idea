package com.mihk.ch10;


interface Counter1 {
    int next();
}

public class LocalInnerClass {
    private int count = 0;

    Counter1 getCounter(final String name) {
        class LocalCounter implements Counter1 {
            public LocalCounter() {
                System.out.println("LocalCounter()");
            }

            @Override
            public int next() {
                System.out.print(name + "\t");
                return count++;
            }
        }
        return new LocalCounter();
    }

    Counter1 getCounter2(final String name) {
        return new Counter1() {
            {
                System.out.println("Counter1()");
            }

            @Override
            public int next() {
                System.out.print(name + "\t");
                return count++;
            }
        };
    }

    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        Counter1 c1 = lic.getCounter("Local inner"),
                c2 = lic.getCounter2("Anonymous inner");
        for (int i = 0; i < 5; i++) {
            System.out.println(c1.next());

        }
        for (int i = 0; i < 5; i++) {
            System.out.println(c2.next());
        }
    }
}
