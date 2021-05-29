package com.in28minutes.java.oops.inheritance;
public class Human {
    private int eyes=2;
    public Human (int eyes){
        this.eyes=eyes;
    }
    public void see(){
        if(eyes==2){
            System.out.println("I am seeing alright");
        }else if(eyes==1){
            System.out.println("I am seeing somehow alright");
        }else if(eyes==0){
            System.out.println("I am blind");
        }
    }
    public String gender(){
        return "I am human";
    }

}
