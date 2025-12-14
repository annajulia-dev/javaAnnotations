package general.lambda;

public class Main {
    public static void main(String[] args){
        Car f1 = () -> System.out.println("Car is running!"); // implements interface method

        f1.run();
    }
}
