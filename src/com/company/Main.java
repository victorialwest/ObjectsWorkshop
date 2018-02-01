package com.company;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat(4, true, "black", false, "solid", "yellow");

        System.out.println("Your cat has the following traits: ");
        System.out.println("Amount of legs: " + cat.getLegs());
        System.out.println("Presence of fur: " + cat.getFur());
        System.out.println("Fur color: " + cat.getColor());
        System.out.println("Presence of a tail: " + cat.getTail());
        System.out.println("Pattern of fur: " + cat.getPattern());
        System.out.println("Eye color: " + cat.getEyeColor());

        Cat cat2 = new Cat(3, true, "Tricolor", true, "Calico", "Green");

        System.out.println("                         ");
        System.out.println("Your cat has the following traits: ");
        System.out.println("Amount of legs: " + cat.getLegs());
        System.out.println("Presence of fur: " + cat.getFur());
        System.out.println("Fur color: " + cat.getColor());
        System.out.println("Presence of a tail: " + cat.getTail());
        System.out.println("Pattern of fur: " + cat.getPattern());
        System.out.println("Eye color: " + cat.getEyeColor());


        Pencil pencil = new Pencil(.7, "Dixon", true, "Red", false);

        Pencil pencil1 = new Pencil(.9, "Ticonderoga",
                false, "black", false );

        System.out.println("                           ");
        System.out.println("This is pencil color: " + pencil.getColor());
        System.out.println("                           ");
        System.out.println("This pencil 1 color: " +pencil1.getColor());


    }
}








