package com.mihk.ch10;

abstract class Wrapping{
    private int id = 1;

    public Wrapping(int id) {
        this.id = id;
    }

    public int value(){
        return id;
    }
}


public class ParCel8 {
    public Wrapping wrapping(int x) {
        return new Wrapping(x) {

            @Override
            public int value() {
                return super.value() * 47;
            }
        };
    }

    public static void main(String[] args) {
        System.out.println(new ParCel8().wrapping(2).value());
    }

}
