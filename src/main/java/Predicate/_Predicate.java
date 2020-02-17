package Predicate;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        System.out.println(isPhoneNumberValid("01024261189"));
        System.out.println(isPhoneNumberValid("00024261189"));
        System.out.println(isPhoneNumberValid("0102426118"));
        System.out.println("Using predicate ===> " + isPhoneNumber.and(phoneNumberContainNumber3).test("01024261189"));
        System.out.println("Using predicate ===> " + isPhoneNumber.or(phoneNumberContainNumber3).test("01024261189"));
    }

    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("01") && phoneNumber.length()==11;
    }

    static Predicate<String> isPhoneNumber = phoneNumber -> phoneNumber.startsWith("010") && phoneNumber.length()==11;

    static Predicate<String> phoneNumberContainNumber3 = phoneNumber -> phoneNumber.contains("3");
}
