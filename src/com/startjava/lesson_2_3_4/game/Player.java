package com.startjava.lesson_2_3_4.game;

public class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }  

    @Override
    public String toString() {
        return name;
    }    
}