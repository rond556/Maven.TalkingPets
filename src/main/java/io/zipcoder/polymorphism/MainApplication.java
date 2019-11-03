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
        for(int i = 0; i < petList.size(); i++){
            Pets pet = petList.get(i);
            System.out.println(String.format("Your number %d pet is a %s named %s.", i + 1, pet.getType(), pet.getName()));
            System.out.println("It says " + pet.speak());
            }
        }

    public static Integer petQuestion() {
        System.out.println("How many pets do you own?\nPlease answer in numerics.");
        return scanner.nextInt();
    }

    public static ArrayList<Pets> petListGenerator(Integer numberOfPets) {
        for (int i = 1; i <= numberOfPets; i++) {
            String typeOfPet = getPetType();
            String nameOfPet = getPetName();

            if(typeOfPet.equals("Dog") || typeOfPet.equals("dog")){
                Pets pet = new Dog(nameOfPet,typeOfPet);
                petList.add(pet);
            }
            else if(typeOfPet.equals("Cat") || typeOfPet.equals("cat")){
                Pets pet = new Cat(nameOfPet,typeOfPet);
                petList.add(pet);
            }
            else if(typeOfPet.equals("Goldfish") || typeOfPet.equals("goldfish")){
                Pets pet = new Goldfish(nameOfPet,typeOfPet);
                petList.add(pet);
            } else {
                Pets pet = new Pets(nameOfPet,typeOfPet);
                petList.add(pet);
            }
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
