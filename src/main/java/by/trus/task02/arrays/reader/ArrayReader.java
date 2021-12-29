package by.trus.task02.arrays.reader;

import by.trus.task02.arrays.exception.ArrayException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class ArrayReader {
    private static final Logger logger = LogManager.getLogger(ArrayReader.class);
    public static List<String> readFromFile(String path) throws ArrayException {
        if(path == null  || path.isBlank()){
            logger.log(Level.ERROR,"Reading isn't successful!");
            throw new ArrayException("String is null  or blank!");
        }
        List<String> arrayList;
        Path dataFile = Paths.get(path);
        try (Stream<String> dataStream = Files.lines(dataFile)) {
            arrayList = dataStream.toList();
            logger.log(Level.INFO, "Reading is successful");
        } catch (IOException e) {
            logger.log(Level.ERROR,"Reading isn't successful!");
            throw new ArrayException("Error while reading file!");
        }
        return arrayList;
    }
}