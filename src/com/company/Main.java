package com.company;

public class Main {
public static class Main2 {


    public static void main(String[] args) {
        Cat cat = new Cat(4, true, "black", false, "solid", "yellow");

        System.out.println("Your cat has the following traits: ");
        System.out.println("Amount of legs: " + cat.getLegs());
        System.out.println("Presence of fur: " + cat.getFur());
        System.out.println("Fur color: " + cat.getColor());
        System.out.println("Presence of a tail: " + cat.getTail());
        System.out.println("Pattern of fur: " + cat.getPattern());
        System.out.println("Eye color: " + cat.getEyeColor());


    }
}

    public static void main(String[] args) {
        Cat2 cat = new Cat2(4, true, "orange", true, "tabby", "green");

        System.out.println("Your cat has the following traits: ");
        System.out.println("Amount of legs: " + cat.getLegs());
        System.out.println("Presence of fur: " + cat.getFur());
        System.out.println("Fur color: " + cat.getColor());
        System.out.println("Presence of a tail: " + cat.getTail());
        System.out.println("Pattern of fur: " + cat.getPattern());
        System.out.println("Eye color: " + cat.getEyeColor());

    }
}


