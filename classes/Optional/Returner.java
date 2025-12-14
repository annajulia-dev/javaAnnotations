package classes.Optional;

import java.util.Optional;
import java.util.function.Supplier;

public class Returner {
    public Optional<String> getName(){

        if(Math.random() >= 0.5)
            return Optional.of("Ana");

        return Optional.empty(); // basically, == null
    }

    public Supplier<String> supplierName(){
        return () -> "Madoka";
    }
}
