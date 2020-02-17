package OptionalCourse;

import java.util.Optional;

public class OptionalMethods {

    public static void main(String[] args) {
        // Creating an empty optional
        Optional<String> empty = Optional.empty();
        System.out.println(empty);


        // using of method to add value not null to optiona
        String programmingLanguage = "Java";
        Optional<String> testOf = Optional.of(programmingLanguage);
        System.out.println(testOf);

//        The static method of expects a non-null argument; otherwise, it will throw a nullpointer exception.
//        So, what if we don't know if the argument will be null or not, that's when we use ofNullable,
//                which is described below.
        Optional<String> ofNull = Optional.ofNullable(displayName());
        System.out.println(ofNull);



        // using ifPresent -> it's take a consumer as an input and return non value
        Optional<Integer> ifPresnt = Optional.ofNullable(22);
        ifPresnt.ifPresent(Integer -> System.out.println(Integer + 22));
        System.out.println(ifPresnt.get());

        // use get and orElse to retrieve value but is this value is not found will retrieve NoSuchElementExceptions
        Optional<Integer> Values = Optional.ofNullable(26);
        System.out.println(Values.get());


        //orElse
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElse("default_name");
        System.out.println(name);


      //  Return the value if present; otherwise, invoke other and return the result of that invocation.
       // orElseGet
        String text=null ;
        String phoneNumber = Optional.ofNullable(text).orElseGet(()->"01024261189");
        System.out.println(phoneNumber);

    }

    static String displayName(){
        String prog = "C++";
        if(prog.contains("#"))
        return prog;
        else return null;
    }
}
