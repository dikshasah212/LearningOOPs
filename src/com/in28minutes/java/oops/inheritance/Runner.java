package com.in28minutes.java.oops.inheritance;

public class Runner {
    public static void main(String[] args) {
        Boy boy =new Boy(1);
        boy.see();
        boy.playCricket();
        System.out.println(boy.gender());
        System.out.println(boy.gender("I am a man!"));
        Girl girl = new Girl(2);
        girl.see();
        girl.skipping();
        System.out.println(girl.gender());
    }
}
