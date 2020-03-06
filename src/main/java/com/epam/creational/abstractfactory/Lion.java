package com.epam.creational.abstractfactory;

public class Lion implements Animal {
    @Override
    public String getType() {
        return "Lion";
    }

    @Override
    public String makeSound() {
        return "Roar";
    }
}
