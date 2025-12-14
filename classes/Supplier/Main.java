package classes.Supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args){

        Supplier<Double> randomNum = () -> Math.random();
        Supplier<LocalDateTime> currentTIme = () -> LocalDateTime.now();
        // usefully when you only will use the value in a specific situation
        // or for values that changes overtime "Random" "currentTime"
        System.out.println(randomNum.get());
        System.out.println(currentTIme.get());

        /*
        import java.util.function.Supplier;

        public class Main {
            public static void main(String[] args) {
                boolean imprimirInfo = false;

                logLazy(imprimirInfo, () -> gerarRelatorioPesado());
            }


            public static String gerarRelatorioPesado() {
                System.out.println("...Processando relatório demorado...");
                return "Relatório Pronto";
            }


            public static void logLazy(boolean deveImprimir, Supplier<String> fornecedorDeMensagem) {
                if (deveImprimir) {
                    System.out.println(fornecedorDeMensagem.get()); // only runs the code if needed
        }
    }
}
         */
    }
}
