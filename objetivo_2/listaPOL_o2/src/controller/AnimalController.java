package controller;

import model.Animal;
import model.Cachorro;
import model.Passaro;
import model.Peixe;

import java.util.*;

public class AnimalController {
    public static void main(String[] args) {
        System.out.println("\n\n======== Exercicio 1.a =========");
        Animal b1 = new Passaro(1,2,3);
        Animal b2 = new Passaro(3,2,1);
        Animal b3 = new Passaro(4,5,6);
        Animal d1 = new Cachorro(9,8);
        Animal d2 = new Cachorro(5,6);
        Animal d3 = new Cachorro(2,1);
        Animal f1 = new Peixe(7,8,9);
        Animal f2 = new Peixe(6,7,8);
        Animal f3 = new Peixe(7,6,5);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(b1);
        animalList.add(b2);
        animalList.add(b3);
        animalList.add(d1);
        animalList.add(d2);
        animalList.add(d3);
        animalList.add(f1);
        animalList.add(f2);
        animalList.add(f3);

        System.out.println(animalList);

        System.out.println("\n\n======== Exercicio 1.b =========");
        animalList.forEach(animal -> {
            animal.mover(2,2);
            animal.desenhar();
            System.out.println(animal);
        });

        // System.out.println("\n"+animalList);

        System.out.println("\n\n======== Exercicio 1.c =========");
        animalList.forEach(animal -> {
            if(animal instanceof Cachorro){
                animal.mover(8,8);
                animal.desenhar();
                System.out.println(animal);
            }
        });

        // System.out.println("\n"+animalList);

        System.out.println("\n\n======== Exercicio 1.d =========");
        animalList.forEach(animal -> {
            if(animal instanceof Peixe){
                ((Peixe) animal).mover(5,5,5);
                animal.desenhar();
                System.out.println(animal);
            }
            if(animal instanceof Passaro){
                ((Passaro) animal).mover(5,5,5);
                animal.desenhar();
                System.out.println(animal);
            }
        });

        System.out.println("\n"+animalList);
    }
}
