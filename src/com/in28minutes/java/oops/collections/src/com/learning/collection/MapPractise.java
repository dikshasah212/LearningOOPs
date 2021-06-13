package com.learning.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPractise {
    public static void main(String[] args) {
        Map employeeMap= new HashMap();
        employeeMap.put(1,"sakshi");
        employeeMap.put(2,"diksha");
        employeeMap.put(3,"ruchi");
        employeeMap.put(4,"kritika");
        System.out.println(employeeMap.get(1));
        System.out.println(employeeMap.get(2));
        System.out.println(employeeMap.get(3));
        System.out.println(employeeMap.get(4));
        Set<Map.Entry> employeeSet = employeeMap.entrySet();
        for (Map.Entry entry: employeeSet) {
            System.out.println("key="+entry.getKey()+"value="+entry.getValue());
        }
    }
}