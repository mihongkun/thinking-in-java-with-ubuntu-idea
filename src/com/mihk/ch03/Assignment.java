package com.mihk.ch03;

class Tank {
    int level;
}

public class Assignment {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;


        System.out.println("1.\tt1.level:\t" + t1.level + "\tt2.level:\t" + t2.level);

        t1 = t2;
        System.out.println("2.\tt1.level:\t" + t1.level + "\tt2.level:\t" + t2.level);

        t1.level = 27;
        System.out.println("3.\tt1.level:\t" + t1.level + "\tt2.level:\t" + t2.level);
    }
}
