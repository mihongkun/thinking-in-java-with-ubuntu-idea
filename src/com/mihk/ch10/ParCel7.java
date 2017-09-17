package com.mihk.ch10;

public class ParCel7 {
    public Contents contents(){
        return new Contents() {
            private int i = 11;
            @Override
            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        ParCel7 p = new ParCel7();
        Contents c = p.contents();
    }


}
