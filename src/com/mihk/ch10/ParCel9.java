package com.mihk.ch10;

public class ParCel9 {
    public Destination destination(String destination) {
        return new Destination() {
            private String label = destination;

            @Override
            public String readLabel() {

                return label;
            }
        };
    }


    public static void main(String[] args) {
        ParCel9 parCel9 = new ParCel9();
        System.out.println(parCel9.destination("mihongkun").readLabel());
    }

}
