package io.zipcoder.polymorphism;

public class Cat extends Pets {

    public Cat(String name, String type) {
        super(name, type);
    }

    public String speak(){return "Meow";}
}
