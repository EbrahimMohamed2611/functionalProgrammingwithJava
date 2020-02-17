package Consumer;

import imperative.main;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _consumer {

    public static void main(String[] args) {
        Customer customer = new Customer("Ebrahim", "01024261189");
        customerConsumer.accept(customer);
        customerBiConsumer.accept(customer, false);


    }

    // use Consumer
    static Consumer<Customer> customerConsumer = customer -> {
        System.out.println(customer.name + "And thanks for your phone "+ customer.Phone);
    };

    // use BiConsumer
    static BiConsumer<Customer,Boolean> customerBiConsumer = (customer,phoneNumberFound) -> {
        System.out.println(customer.name + "And thanks for your phone "+( (phoneNumberFound)?customer.Phone : "******" ));
    };

    static class Customer{

        private final String name ;

        private final String Phone;

        public Customer(String name,String  Phone) {
            this.name = name;
            this.Phone = Phone;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", Phone='" + Phone + '\'' +
                    '}';
        }
    }



}


