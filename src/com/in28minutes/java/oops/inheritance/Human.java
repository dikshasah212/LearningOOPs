package com.learning.collection;

public class PolymorphismRunner {
    public static void main(String[] args) {
        System.out.println("human count=" + Human.getCount());
        Human human = new Human(2);
        System.out.println(human.gender());
        //human.getcount=human.count+1;
        human.increment();
        System.out.println("human count=" + human.getCount());
        human.see();
        Human human2 = new Human(1);
        human2.increment();
        System.out.println("human count=" + human2.getCount());
        human2.see();
        Boy boy = new Boy(0);
        System.out.println(boy.gender());
        System.out.println(boy.gender("I am boy!"));
        Human human1 = new Boy(2);
        System.out.println(human1.gender());  //method overidding
        human1.see();
        Boy boy1=(Boy)human1;
        //Girl girl1=(Girl)human1;
        //girl1.skipping();
        // PolymorphismRunner runner=(PolymorphismRunner) human1;
        Human h1[]={new Boy(2),new Girl(1)};
//       h1[0]=new Boy(2);
//       h1[1]=new Girl(1);
        for(int i=0;i<h1.length;i++){
            if(h1[i] instanceof Boy) {
                Boy bbb = (Boy) h1[i];
                bbb.playCricket();
                //System.out.println();
            }else if(h1[i] instanceof Girl){
                Girl g1 = (Girl) h1[i];
                g1.skipping();
            }
        //System.out.println(human1.gender("I am boy!"));
        //Human human2 = new Girl(1);
        //System.out.println(human2.gender());
    }
}