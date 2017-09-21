package com.mihk.ch11;


import java.util.ArrayList;
import java.util.List;

public class AppleAndOrangeWithGenerics {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple());
//        apples.add(new Orange());
        apples.add(new Apple());
        for (int i = 0;i<apples.size();i++) {
            System.out.println(apples.get(i).getId());
        }
    }


}
