package com.Codechef;
import java.util.*;

public class _Treeset_in_java_ {
    public static void main(String[] args) {
        /*
        Treeset in java, its based on binary search tree or self balanced tree.
         */
        TreeSet<String> s = new TreeSet<String>();
        s.add("nitin");
        s.add("abhishek");
        s.add("alok");
        System.out.println(s);
        Iterator<String> i = s.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
