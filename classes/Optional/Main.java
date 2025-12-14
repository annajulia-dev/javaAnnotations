package classes.Optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args){
        Returner returner = new Returner();

        Optional<String> nameBox = returner.getName();

        String name = nameBox.orElse("No name found!"); // if null get other string

        String name2 = nameBox.orElseGet(returner.supplierName()); // if null get a class.supplier

        System.out.println(name);
        System.out.println(name2);
    }
}
