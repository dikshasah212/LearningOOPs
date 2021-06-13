package com.learning.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        List employeeNames = new ArrayList(10);
        employeeNames.add("SAKSHI");
        employeeNames.add("DIKSHA");
        employeeNames.add("RUCHI");
        employeeNames.add("KRITIKA");

        employeeNames.add(4, "AVI");
        employeeNames.add(0, "VIKASH");
        employeeNames.add(5, "tiger");
        System.out.println(employeeNames.get(0));
        System.out.println(employeeNames.get(1));

        System.out.println(employeeNames.get(2));
        System.out.println(employeeNames.get(3));
        System.out.println(employeeNames.get(4));
        System.out.println("==================");
        for (int i = 0; i < 5; i++) {
            System.out.println(employeeNames.get(i));
        }
        System.out.println("==================");
        for (Object emp : employeeNames) {
            System.out.println(emp);

        }
        System.out.println("==================");
        Iterator itr = employeeNames.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
