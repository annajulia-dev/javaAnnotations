package classes.Threading;

public class Main {

    public static void main(String[] args){

        Thread thread = new Thread(new Car("Fusca", 50));
        Thread thread2 = new Thread(new Car("Ferrari", 70));
        Thread thread3 = new Thread(new Car("Mustang", 80));

        thread.start();
        thread2.start();
        thread3.start();


    }
}
