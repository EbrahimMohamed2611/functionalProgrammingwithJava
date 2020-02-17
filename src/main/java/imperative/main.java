package imperative;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        System.out.println("============== Imperative Programming ==============");
        List<Person> people = List.of(
                new Person("Ebrahim", Gender.MALE),
                new Person("Mohsen", Gender.MALE),
                new Person("Aisha", Gender.FEMALE),
                new Person("Gehad", Gender.FEMALE),
                new Person("Nady", Gender.MALE),
                new Person("Marwa", Gender.FEMALE)
        );

        // Imperative Approach
        ArrayList<Person> females = new ArrayList<Person>();
        for (Person persone : people) {
            if (persone.gender.equals(Gender.FEMALE))
                females.add(persone);

        }

        for (Person persone : females) {
            System.out.println(persone);

        }


        System.out.println("============== Declarative Programming ==============");

        List<Person> females2 = people.stream().
                filter(person -> person.gender.equals(Gender.FEMALE)).
                collect(Collectors.toList());
        females2.forEach(System.out::println);
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
