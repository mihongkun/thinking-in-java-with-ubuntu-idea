package com.mihk.ch15;

import java.util.Map;

interface  Eat {

}

class Pet implements Eat {
    public Pet() {
        System.out.println("Pet()");
    }
}

class Person implements Eat {
    public Person() {
        System.out.println("Person()");
    }
}

class Chinese extends Person {
    public Chinese() {
        System.out.println("Chinese()");
    }
}

class DogPet extends Pet {
    public DogPet() {
        System.out.println("DogPet()");
    }
}

public class SimplerPets {
    public static void main(String[] args) {
        Map<? extends Person,? extends Pet> petPeople = New.map();
        Person p = new Chinese();
        Pet dp = new DogPet();
//        petPeople.put((Chinese)p,(DogPet) dp);
    }

}
