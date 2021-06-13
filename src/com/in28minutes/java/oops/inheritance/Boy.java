package com.in28minutes.java.oops.inheritance;

public class Boy extends Human{
    public Boy(int eyes){
        super(eyes);
    }
    @Override
    public String gender(){

        return "I am Male";
    }
    public String gender(String gender){
        return gender;
    }
    public void playCricket(){
        System.out.println("PLaying Cricket");
    }
    public void emotion(){
        System.out.println("Boys are emotionless!");
    }
}
