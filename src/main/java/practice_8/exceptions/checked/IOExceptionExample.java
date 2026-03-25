package practice_8.exceptions.checked;

import java.io.BufferedReader;
import java.io.FileDescriptor;
import java.io.FileReader;
import java.io.IOException;

//МЫ ДОЛЖНЫ ОБРАБОТАТЬ ИСКЛЮЧЕНИЕ!!!
public class IOExceptionExample {
    static void main(String[] args) {
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader("example.txt"));
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error by reading the file: " + e.getMessage());
        } finally {
            try{
                if(reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error by closing the file: " + e.getMessage());
            }
        }
    }
}
