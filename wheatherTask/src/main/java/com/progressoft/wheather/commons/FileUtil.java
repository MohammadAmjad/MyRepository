package com.progressoft.wheather.commons;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileUtil {

    public static Stream<String> readLinesFromFile(String filePath) {
        try {
            return Files.lines(Paths.get(filePath));
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    public static Stream<Path> readListOfFiles(String directory) {
        try {
            return Files.list(Paths.get(directory));
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
