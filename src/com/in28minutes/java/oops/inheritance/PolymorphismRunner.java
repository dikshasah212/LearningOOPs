package com.in28minutes.java.oops.inheritance;

public class PolymorphismRunner {
    public static void main(String[] args) {
        //Human human = new Human(2);
        //System.out.println(human.gender());
        Boy boy = new Boy(0);
        System.out.println(boy.gender());
        System.out.println(boy.gender("I am Boy!"));
        Human human1 = new Boy(2);
        System.out.println(human1.gender());  //method overidding
        human1.see();
        //System.out.println(human1.gender("I am boy!"));
        Human human2 = new Girl(1);
        System.out.println(human2.gender());
    }
}
