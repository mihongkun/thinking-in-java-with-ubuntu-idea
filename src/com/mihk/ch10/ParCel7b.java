package com.mihk.ch10;

public class ParCel7b {

    class MyContents implements Contents {
        private int i = 11;
        @Override
        public int value() {
            return i;
        }
    }


    public Contents contents() {return new MyContents();}

    public static void main(String[] args) {
        ParCel7b p = new ParCel7b();
        Contents c = p.contents();
    }

}
