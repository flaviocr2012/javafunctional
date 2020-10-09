package functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        System.out.println(getDBConnectioUrl());
        System.out.println(getDBConnectioUrlsSupplier.get());
    }

    static String getDBConnectioUrl (){
        return "jdbc://localhost:5432/users";
    }

    static Supplier<List<String>> getDBConnectioUrlsSupplier = ()
            -> List.of(
            "jdbc://localhost:5432/users",
            "jdbc://localhost:5432/customer");

}

