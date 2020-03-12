package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileUtil {
    /**
     * Read file
     * @param fileName
     * @return List
     * @throws IOException
     */
    public List<String> readFile(String fileName) throws IOException {
        List<String> result;
        try(Stream<String> lines = Files.lines(Paths.get(fileName))) {
            result = lines.collect(Collectors.toList());
        }
        return result;
    }
}
