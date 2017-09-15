package com.mihk.ch10;






public class ParCell2 {

    class Contents{
        private int i = 11;
        public int value(){
            return i;
        }
    }

    class Destination{
        private String label;

        Destination(String label) {
            this.label = label;
        }

        String readLabel(){
            return label;
        }
    }


    public Destination to(String str) {
        return new Destination(str);
    }


    public Contents contents(){
        return new Contents();
    }

    public void ship(String dest){
        Contents contents = new Contents();
        System.out.println(contents.value());
        Destination destination = to(dest);
        System.out.println(destination.readLabel());
    }

    public static void main(String[] args) {
        ParCell2 parCell2 = new ParCell2();
        parCell2.ship("mihongkun");
        ParCell2 q = new ParCell2();
        ParCell2.Contents c = q.contents();
        ParCell2.Destination d = q.to("hello");
    }

}
