package com.epam.creational.abstractfactory;


public interface AbstractFactory<T> {
    T create(String animalType) ;
}

