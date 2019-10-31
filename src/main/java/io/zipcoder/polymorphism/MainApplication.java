package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {


    ArrayList<String> petList = new ArrayList<String>();
    private static Scanner scanner = new Scanner(System.in);
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Integer numberOfPets = petQuestion();
        String listOfPets = petListGenerator(numberOfPets);
        System.out.println(listOfPets);
    }

    public static Integer petQuestion() {
        System.out.println("How many pets do you own?\nPlease answer in numerics.");
        return scanner.nextInt();
    }

    public static String petListGenerator(Integer numberOfPets) {
        for (int i = 1; i <= numberOfPets; i++) {
            String typeOfPet = getPetType();
            sb.append(typeOfPet).append(" - ");
            String nameOfPet = getPetName();
            sb.append(nameOfPet).append("\n");
        }
        return sb.toString();
    }

    public static String getPetType(){
        System.out.println("What kind of pet do you own?");
        String typeOfPet = scanner.nextLine();
        return typeOfPet;
    }

    public static String getPetName(){
        System.out.println("What is its name?");
        String nameOfPet = scanner.nextLine();
        return nameOfPet;
    }
}
