package functionStyle;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _function {
    public static void main(String[] args) {

//        System.out.println("======== Using Regular Function ========");
//        int regularIncrement = regularIncrement(1);
//        System.out.println(regularIncrement);
        System.out.println("======== Using Function Style ========");
//        int incremented = incrementOneByFunction.apply(1);
//        System.out.println(incremented);

        Function<Integer, Integer> resultofOfChainin =
                incrementOneByFunction
                        .andThen(multiplyBy10.andThen(devisionBy2.andThen(substractBy2)));
        System.out.println(resultofOfChainin.apply(10));

        System.out.println("======== Using Regular Function Style ========");
        System.out.println(incrementAndMult(10,20));
        System.out.println("======== Using BiFunction Style ========");
        System.out.println(incrementByNumberAndMultiplayBiFunction.apply(10, 20));

    }

    // using function style
    static Function<Integer, Integer> incrementOneByFunction = number -> number+1;

    static Function<Integer, Integer> multiplyBy10 = number -> number*10;

    static Function<Integer, Integer> devisionBy2 = number -> number/2;

    static Function<Integer, Integer> substractBy2 = number -> number-10;

    static int incrementAndMult(int numb,int mult){

        return (numb+1)*mult;
    }

    static BiFunction<Integer, Integer, Integer> incrementByNumberAndMultiplayBiFunction = (number1, number2) ->(number1+1)*number2;
}
