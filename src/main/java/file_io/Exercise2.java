package file_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise2 {
    // Read the lines one at a time.
    // When you find one that contains “test”, print it out and stop reading the file.
    public static void main(String[] args) {
        BufferedReader reader;
        String fileName = "src/main/resources/test.txt";
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();
            while (line != null && !(line.contains("test"))) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
