package com.vp.model;

import java.util.List;

public class Person {
    private String name;
    private Gender gender;
    private int age;
    private List<Pet> pets;

    public Person(String name, Gender gender, int age, List<Pet> pets) {
        super();
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.pets = pets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}
