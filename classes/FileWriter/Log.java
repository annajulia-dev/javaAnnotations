package classes.FileWriter;

import java.io.FileWriter;

public class Log {

    public void writeLog(FileWriter writer, String text){
        try
        {
            writer.write(text);
        }
        catch(java.io.IOException e)
        {
            System.out.println("Error writing the logs");
        }
    }



}
