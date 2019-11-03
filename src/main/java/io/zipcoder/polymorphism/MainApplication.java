package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 * Coding created by Ron Duwell
 */
public class MainApplication {


    private static ArrayList<Pets> petList = new ArrayList<Pets>();
    private static Scanner scanner = new Scanner(System.in);
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Integer numberOfPets = petQuestion();
        ArrayList<Pets> petList = petListGenerator(numberOfPets);
        System.out.println(petList.toString());
    }

    public static Integer petQuestion() {
        System.out.println("How many pets do you own?\nPlease answer in numerics.");
        return scanner.nextInt();
    }

    public static ArrayList<Pets> petListGenerator(Integer numberOfPets) {
        for (int i = 1; i <= numberOfPets; i++) {
            Pets pet = new Pets(null,null);
            String typeOfPet = getPetType();
            String nameOfPet = getPetName();
            pet.setName(nameOfPet);
            pet.setType(typeOfPet);
            petList.add(pet);
        }
        return petList;
    }

    public static String getPetType(){
        System.out.println("What kind of pet do you own?");
        String typeOfPet = scanner.next();
        return typeOfPet;
    }

    public static String getPetName(){
        System.out.println("What is its name?");
        String nameOfPet = scanner.next();
        return nameOfPet;
    }
}
