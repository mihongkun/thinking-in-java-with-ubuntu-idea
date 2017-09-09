package com.mihk.ch03;

public class Dog {
    private String name;
    private String says;

    public Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        if (name != null ? !name.equals(dog.name) : dog.name != null) return false;
        return says != null ? says.equals(dog.says) : dog.says == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (says != null ? says.hashCode() : 0);
        return result;
    }

    public Dog() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSays() {
        return says;
    }

    public void setSays(String says) {
        this.says = says;
    }

    public static void main(String[] args) {

        Dog spot = new Dog("spot","Ruff!");
        Dog scruffy = new Dog("scruffy","Wurf!");
        Dog spotCopy = spot;


        System.out.println(spot.getName() +","+spot.getSays());
        System.out.println(scruffy.getName()+","+scruffy.getSays());
        System.out.println((spot.equals(spotCopy)) +","+ (spot == spotCopy));
        System.out.println(Math.E);

    }

}
