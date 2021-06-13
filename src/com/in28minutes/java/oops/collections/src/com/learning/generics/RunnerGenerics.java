package com.learning.generics;

public class RunnerGenerics {
    public static void main(String[] args) {
        Addition a1= new Addition();
        //a1.add(3,9);
        System.out.println(a1.add(3, 9));
        System.out.println(a1.add(3.5, 9.8));

        Tuple<String,Double,Integer> tp1 = new Tuple<>("9.0",9.0, 5);
        System.out.println(tp1.getFirst().toLowerCase()+" "+tp1.getSecond().doubleValue()+" "+tp1.getThird().doubleValue());
        //System.out.println();
    }
}
