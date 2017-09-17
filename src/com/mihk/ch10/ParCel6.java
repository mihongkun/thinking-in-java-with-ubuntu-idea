package com.mihk.ch10;

public class ParCel6 {
    private void internalTracking(boolean b){
        if(b) {
            class TrackingSlip {
                private String id;

                TrackingSlip(String id) {
                    this.id = id;
                }

                public String getId() {
                    return id;
                }
            }

            TrackingSlip ts = new TrackingSlip("Hello,World!");
            String id = ts.getId();
        }


    }

    public void track(){
        internalTracking(true);

    }



    public static void main(String[] args) {
        ParCel6 p = new ParCel6();
        p.track();
    }

}
