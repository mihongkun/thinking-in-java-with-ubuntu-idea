package com.mihk.ch11;

import java.util.ArrayList;
import java.util.List;

class Apple {
    private static long counter;
    private final long id = counter ++;

    public long getId() {
        return id;
    }
}

class Orange {

}




public class AppleAndOrangeWithoutGenerics {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List appleList= new ArrayList();
        for (int i = 0;i<3;i++) {
            appleList.add(new Apple());

        }
        appleList.add(new Orange());
        for(int i = 0;i<appleList.size();i++) {
            System.out.println(((Apple) appleList.get(i)).getId());
        }

    }

}
