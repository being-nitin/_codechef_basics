package com.Codechef;
import java.util.*;

public class _treeset_with_its_methods_ {

    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<Integer>();
        t.add(5);
        t.add(3);
        t.add(7);
        t.add(8);
        t.remove(3);
        System.out.println(t.higher(5));
        System.out.println(t.higher(7));
        System.out.println(t.ceiling(7));
        System.out.println(t.floor(4));
    }
}
