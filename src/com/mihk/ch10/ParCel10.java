package com.mihk.ch10;

public class ParCel10 {
    public Destination destination(final String dest,final float price) {
        return new Destination() {
            private int cost;
            {
                cost = Math.round(price);
                if (cost>90) System.out.println("Over budget!");
            }
            @Override
            public String readLabel() {
                return label;
            }
            private String label = dest;

        };
    }

    public static void main(String[] args) {
        ParCel10 p = new ParCel10();
        Destination d = p.destination("mihongkun",100000);
    }

}
