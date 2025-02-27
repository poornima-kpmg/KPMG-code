package com.programming.class1;

public class B2 implements exam {

    private int questions;
    private String subject;
    private int duration;

    @Override
    public void setQuestions(int num) {
        this.questions = num;
    }

    @Override
    public void setSubject(String name) {
        this.subject = name;
    }

    @Override
    public void setDuration(int num) {
        this.duration = num;
    }

    public static void main(String[] args) {
        B2 obj = new B2();
        
        obj.setQuestions(25);
        System.out.println(obj.questions);
        
        obj.setSubject("Java");
        System.out.println(obj.subject);
        
        obj.setDuration(60);  
        System.out.println(obj.duration);
        
    }
}
