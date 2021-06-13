package com.learning.collection;
import java.util.ArrayList;

public class ArrayPractice extends Object {
    public static void main(String[] args) {
        int array[]=new int[10];
        array[0]=2;
        array[1]=21;
        array[2]=22;
        array[3]=24;
        Object array1[]=new Object[20];
        array1[0]="Ruchi";
        array1[1]=5;
        Integer integer=new Integer(6);
        integer.doubleValue();
        array1[2]=3.8;
        array1[3]=new ArrayPractice();
        array1[4]=new ListPractice();
        array1[5]=integer;
        Integer intval=10;
        int intval1=intval;
        array1[6]=intval;
        array1[7]=intval1;
        Object obj = new ArrayPractice();
        ArrayPractice a1=(ArrayPractice) obj;
        System.out.println(a1);
        System.out.println(obj);
//        for(int i=0;i<array1.length;i++){
//            System.out.println(array1[i]);
//        }
        int array2[]={1,2,3,4};
    }
    @Override
    public String toString() {
        return "I am array practice";
    }

}
