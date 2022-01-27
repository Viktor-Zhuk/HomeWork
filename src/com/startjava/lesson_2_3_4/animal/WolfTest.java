package com.startjava.lesson_2_3_4.animal;

public class WolfTest {
    
    public static void main(String[] args) {
        Wolf newWolf = new Wolf();
        newWolf.setSex('m');
        newWolf.setNickName("Predator");
        newWolf.setWeight(15.7f);
        newWolf.setAge((byte) 5);
        newWolf.setColor("gray");

        System.out.println("sex: " + newWolf.getSex());
        System.out.println("nickName: " + newWolf.getNickName());
        System.out.println("weight: " + newWolf.getWeight());
        System.out.println("age: " + newWolf.getAge());
        System.out.println("color: " + newWolf.getColor());
    }
}