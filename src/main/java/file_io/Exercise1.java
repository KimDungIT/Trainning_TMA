package file_io;

import util.FileUtil;

import java.io.IOException;
import java.util.List;

/**
 * Exercise1
 *
 * Version info
 *
 * Copyright notice
 */
public class Exercise1 {
    //Read all the lines into a List, then print out the first line that contains "test"
    public static void main(String[] args) throws IOException {
        String fileName = "src/main/resources/test.txt";
        FileUtil fileUtil = new FileUtil();
        List<String> result = fileUtil.readFile(fileName);
        for (String line: result) {
            if(line.contains("test")) {
                System.out.println(line);
            }
        }
    }
}
