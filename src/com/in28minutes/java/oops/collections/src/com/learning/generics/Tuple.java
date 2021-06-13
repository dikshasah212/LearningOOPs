package com.learning.generics;

public class Tuple<T1 extends String, T2, T3> implements Triplet<T1, T2, T3> {
    private T1 first;
    private T2 second;
    private T3 third;
    public Tuple(T1 first, T2 second, T3 third){
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public T1 getFirst() {
        return first;
    }

    @Override
    public T2 getSecond() {
        return second;
    }

    @Override
    public T3 getThird() {
        return third;
    }
}
