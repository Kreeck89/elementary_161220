package lesson3;

import lesson3.generics.Calculate;
import lesson3.wildcards.Animal;
import lesson3.wildcards.Dog;
import lesson3.wildcards.Pit;
import lesson3.wildcards.Stuff;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //wildcards
        ArrayList<Object> objects = new ArrayList<>();
        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Pit());
        dogs.add(new Stuff());
        ArrayList<Pit> pits = new ArrayList<>();
        ArrayList<Stuff> stuffs = new ArrayList<>();

//        checkExtendsWildcards(animals);
        checkExtendsWildcards(dogs);
        checkExtendsWildcards(pits);
        checkExtendsWildcards(stuffs);

        checkSuperWildcards(objects);
        checkSuperWildcards(animals);
        checkSuperWildcards(dogs);
//        checkSuperWildcards(pits);
//        checkSuperWildcards(stuffs);

        //Generics with classes:
        Calculate<String, Integer, Integer> calculate = new Calculate<>();
        Integer first = calculate.getFirst();
        Integer second = calculate.getSecond();
        double sumResult = calculate.getSumResult(100, 13);
        System.out.println("sumResult: " + sumResult);

        LinkedList<Object> list = new LinkedList<>();
        list.addFirst(new Object());
        list.addLast(new Object());

        HashSet<String> strings = new HashSet<>();

    }

    private static void checkExtendsWildcards(List<? extends Dog> dogs) {
//        dogs.add(new Animal());
//        dogs.add(new Dog());
//        dogs.add(new Pit());
//        dogs.add(new Stuff());

    }

    private static void checkSuperWildcards(List<? super Dog> dogs) {
//        dogs.add(new Animal());
        dogs.add(new Dog());
        dogs.add(new Pit());
        dogs.add(new Stuff());
    }
}
