package com.pcschool.ocp.d10.case3;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo3 {

    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();//<>裡面的Integer可以不用打(贅字)
        set.add(100);
        set.add(90);
        set.add(80);
        Iterator<Integer> iter = set.iterator();
        int sum = 0;
        while (iter.hasNext()) {
            Integer next = iter.next();
            sum += next;
        }
        System.out.println(sum);
        //Java 8 
        sum = set.stream()
                .mapToInt(note -> note.intValue()).sum();
        System.out.println(sum);
        sum = set.stream().mapToInt(note -> note).sum();
        System.out.println(sum);

    }
}
