package io.zipcoder.polymorphism;

public class Dog extends Pets{

    public Dog(String name, String type) {
        super(name, type);
    }

    public String speak(){return "woof.";}
}
