package com.cydeo.bootstrap;

import com.cydeo.model.Student;
import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataGenerator {

    static Faker faker = new Faker();

    public static List<Student> createStudent() {
        List<Student> list = Arrays.asList(
                new Student(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(45, 55), faker.address().city()),
                new Student(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(45, 55), faker.address().city()),
                new Student(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(45, 55), faker.address().city()),
                new Student(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(45, 55), faker.address().city()),
                new Student(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(45, 55), faker.address().city()),
                new Student(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(45, 55), faker.address().city()));


        return list;
    }

}
