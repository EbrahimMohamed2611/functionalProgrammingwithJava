package optiona;

import java.util.Optional;

public class _Optional {

    public static void main(String[] args) {
        Person person = new Person("Ebrahim Mohamed" , "EBRAHIM@GMAIL.COM");

        String email = person.getEmail().map(String::toLowerCase).orElse("email not found");
        System.out.println(email);
    }
}

class Person{

    private final String name;

    private final String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
}