package com.epam.creational.singleton;

import com.epam.creational.singleton.Singleton;

public class Client {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.message);
    }
}
