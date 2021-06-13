package com.learning.generics;

public class Addition {
//    public int add(int x, int y){
//        return x+y;
//    }
//    public double add(double x, double y){
//        return x+y;
//    }
    public<T extends Number > int add(T x, T y){
        return x.intValue() + y.intValue();
    }
}
