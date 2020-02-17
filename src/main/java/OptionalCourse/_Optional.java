package OptionalCourse;

import java.util.Optional;

public class _Optional {
    public static void main(String[] args) {
        Optional<String> hello = Optional.of("hello world");

//        Optional<String> ability = Optional.ofNullable(null);
        Optional<String> ability = Optional.ofNullable("\n Ebrahim Mohamed Ebrahim ");
     //   System.out.println(ability.orElse("this is default value instead of null"));
        String orElase = ability.map(String -> String.toLowerCase()).orElseGet(()->{
                                                        // can do any operation here
                                                        return " small worlds default";
                                                            }

        );


        // Possible null value
        Optional<String> optional = Optional.ofNullable(name());

        System.out.println(optional);
        System.out.println("======== To lower Case" + orElase);
        System.out.println(hello.isEmpty());
        System.out.println(hello.isPresent());
        System.out.println(hello.get());

        hello.orElse("This is a default value");
    }

    static String name(){
        String name = "Java";
        return (name.length() > 3) ? name :  null;
    }
}
