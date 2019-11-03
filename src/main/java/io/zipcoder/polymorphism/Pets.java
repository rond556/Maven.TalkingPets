package io.zipcoder.polymorphism;

public class Pets {
    String name;
    String type;


    public Pets(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Pets{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public void setType(String type) {
        this.type = type;
    }


    public String speak(){
        return "huh?";
    }
}
