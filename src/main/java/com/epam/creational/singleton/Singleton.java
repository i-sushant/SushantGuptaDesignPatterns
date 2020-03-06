package com.epam.creational.singleton;

public class Singleton {
    private static Singleton instance = null;
    public String message = "";

    private Singleton(){
        message = "This is message!!";
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
