package Suppliers;

import java.util.List;
import java.util.function.Supplier;

public class _supplier {

    public static void main(String[] args) {
        System.out.println(getConnectionUrls.get());
    }



    static Supplier<List<String>> getConnectionUrls = ()-> List.of(
            "jdbc://localhost:5432//users",
            "jdbc://localhost:5432//customers",
            "jdbc://localhost:5432//suppliers",
            "jdbc://localhost:5432//developer"
    );
}
