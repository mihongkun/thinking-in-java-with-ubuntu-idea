package com.mihk.ch10;


interface Wrap {

    void showId(String prefix);
    void changeId(int id);
}

public class P10C12 {
    private int id;
    private String showId(){
        return "Id = " + id;
    }
    public Wrap getInner(){
        return new Wrap(){

            @Override
            public void showId(String prefix) {
                System.out.println(prefix + " " + P10C12.this.showId());
            }

            @Override
            public void changeId(int id) {
                P10C12.this.id = id;
            }
        };
    }


    public static void main(String[] args) {
        P10C12 p = new P10C12();
        Wrap in = p.getInner();
        in.showId("Change before");
        in.changeId(15);
        in.showId("Change after");
    }
}
