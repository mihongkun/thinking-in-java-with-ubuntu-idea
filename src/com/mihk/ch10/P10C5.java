package com.mihk.ch10;

public class P10C5 {
    private int id;

    private void f() {
        System.out.println("Outside method,id = " + id);
    }

    class Innerside {
        Innerside(int i) {
            id = i;
        }

        public int getId() {
            return id;

        }

        public void showId(){
            f();
        }
    }

    public Innerside change(int i) {
        return new Innerside(i);

    }

    public void showId() {
        f();
    }


    public static void main(String[] args) {
        P10C5 p10C5 = new P10C5();
        p10C5.showId();
        System.out.println("p10C5.f() change before:" + p10C5.change(10).getId());
        p10C5.change(10).showId();
        p10C5.showId();
        System.out.println("p10C5.f() change before:" + p10C5.change(12).getId());
        p10C5.change(12).showId();
        p10C5.showId();
    }


}
