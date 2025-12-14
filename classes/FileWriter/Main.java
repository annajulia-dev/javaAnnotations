package classes.FileWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner("System.in");
        try(FileWriter writer = new FileWriter("logs.txt"))
        {
            
        }
        catch(java.io.IOException e)
        {
            System.out.println("Error to open the file");
        }

    }
}
