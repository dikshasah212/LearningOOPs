package com.in28minutes.java.oops.inheritance;
public class Girl extends Human{
    private int eyes;
    public Girl(int eyes){
        super(eyes);
        this.eyes=eyes;
    }
    @Override
    public String gender(){
        return "I am Female";
    }

    @Override
    public void emotion() {

    }

    public void skipping(){
        System.out.println("We can Skip");
    }
}
