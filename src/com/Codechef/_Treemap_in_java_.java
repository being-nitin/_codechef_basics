package com.Codechef;
import java.util.*;

public class _Treemap_in_java_ {

    public static void main(String[] args) {
        /*
        treemap is also implemented on red black tree , or self balance binary tree.
         */
        TreeMap<Integer,String> t = new TreeMap<Integer,String>();
        t.put(10,"geeks");
        t.put(15,"nitin");
        t.put(26,"alok");
        System.out.println(t.containsKey(10));

        // for traversing
        for(Map.Entry<Integer,String> e: t.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
        System.out.println(t.higherKey(10));
        System.out.println(t.lowerKey(15));
        System.out.println(t.ceilingKey(16));
        System.out.println(t.floorKey(26));

        System.out.println(t.higherEntry(10).getValue());
        System.out.println(t.lowerEntry(10).getValue());
        System.out.println(t.ceilingEntry(10).getValue());
        System.out.println(t.floorEntry(10).getValue());
    }
}
