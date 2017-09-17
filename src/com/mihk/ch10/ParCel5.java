package com.mihk.ch10;



public class ParCel5 {
    public Destination destination(String s){
        class PDestination implements Destination {
            private String label;

            private PDestination(String label) {
                this.label = label;
            }

            @Override
            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        ParCel5 p = new ParCel5();
        Destination destination = p.destination("mihongkun");
    }

}
