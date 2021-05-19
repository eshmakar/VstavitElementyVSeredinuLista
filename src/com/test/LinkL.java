package com.test;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkL {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        ListIterator<Integer> iterator = list.listIterator();
        iterator.add(0);
        for (int i = 0; i < 20; i++) {
            iterator.add(i + 1);
            if (i % 2 == 0) {
                iterator.previous();
            }
        }
        System.out.println(list);
    }
}

