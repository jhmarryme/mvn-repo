package com.jhmarryme.demo.pojo.model.unitTest.JMockit;

public class Dog extends Animal {

    public Dog(String name, Integer age) {
        super(name, age);
    }

    public String shut(){
        String voice = "wang wang wang!";
        System.out.println(voice);
        return voice;
    }

    public Boolean isHealthy(){
        return isHealthy;
    }
}
