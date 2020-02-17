package Streams;

import java.util.List;
import java.util.stream.Collectors;

import static Streams._stream.Gender.*;

public class _stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Ebrahim", MALE),
                new Person("Mohsen", MALE),
                new Person("Aisha", FEMALE),
                new Person("Gehad", FEMALE),
                new Person("Nady", MALE),
                new Person("Marwa", FEMALE)
        );

//        people.stream()
//                .map(person -> person.gender)
//                .collect(Collectors.toList())
//                .forEach(gender -> System.out.println(gender));

        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);

        boolean allPersonAreFemale = people.stream().allMatch(person -> FEMALE.equals(person.gender));
        System.out.println(allPersonAreFemale);

        boolean personsAtLeastContainFemale = people.stream().anyMatch(person -> FEMALE.equals(person.gender));
        System.out.println(personsAtLeastContainFemale);

        boolean personAreNotContainAnyFemale = people.stream().noneMatch(person -> FEMALE.equals(person.gender));
        System.out.println(personAreNotContainAnyFemale);

        people.stream().filter(person -> MALE.equals(person.gender)).collect(Collectors.toList()).forEach(System.out::println);
    }

    static class Person{

        private final String name ;

        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }



    enum Gender{
        MALE, FEMALE
    }
}
