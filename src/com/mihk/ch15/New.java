package com.mihk.ch15;

import org.jetbrains.annotations.Contract;

import java.util.*;

public class New {


    public static <K,V>Map<K,V> map () {
        return new HashMap<>();
    }


    public static <T>List<T> list (){
        return new ArrayList<>();
    }

    public static <T> List<T> linkedList(){
        return new LinkedList<>();
    }

    public static <T> Set<T> set(){
        return new HashSet<>();
    }

    public static <T> Queue <T> queue(){
        return new LinkedList<>();
    }

    public static void main(String[] args) {
        Map<String,List<String>> sls = New.map();
        List<String> ls = New.list();
        List<String> lls = New.linkedList();
        Set<String> s = New.set();
        Queue<String> q = New.queue();
    }

}
