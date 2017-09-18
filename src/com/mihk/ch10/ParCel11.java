package com.mihk.ch10;

public class ParCel11 {
    private static class ParcelContents implements Contents {
        private int i = 11;
        @Override
        public int value() {
            return i;
        }
    }

    protected static class ParcelDestination implements Destination {
        private String label;

        private ParcelDestination(String label) {
            this.label = label;
        }

        @Override
        public String readLabel() {
            return null;
        }

        public static void f(){}

        static int x = 10;
        static class AnnotherLevel {
            public static void f(){}
            static int x = 10;
        }

    }

    public static Destination destination(String label){
        return new ParcelDestination(label);
    }

    public static Contents contents() {
        return new ParcelContents();
    }

    public static void main(String[] args) {
        Contents contents = contents();
        Destination destination = destination("mihongkun");
    }


}
