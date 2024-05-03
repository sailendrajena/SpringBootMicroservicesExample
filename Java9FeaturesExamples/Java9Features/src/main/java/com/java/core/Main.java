package com.java.core;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4);
        list.add(5);
        System.out.println(list);
    }
}