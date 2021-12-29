package by.trus.task02.arrays.parser;

import by.trus.task02.arrays.exception.ArrayException;
import by.trus.task02.arrays.validator.ArrayValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayParser {
    private static final Logger logger = LogManager.getLogger(ArrayParser.class);
    private static final String REGEXP_DELIMITER = "\\s+";
    public static List<int[]> parse(List<String> list) throws ArrayException {
        if (list == null || list.isEmpty()) {
            logger.log(Level.WARN,"Parsing isn't successful!");
            throw new ArrayException("List is null or empty!");
        }
        List<int[]> intList;
        try {
            intList = list.stream()
                    .map(String::trim)
                    .filter(ArrayValidator::isNumeric)
                    .map(line -> line.split(REGEXP_DELIMITER))
                    .map(array -> Stream.of(array)
                            .mapToInt(Integer::parseInt)
                            .toArray())
                    .collect(Collectors.toList());
            logger.log(Level.INFO, "Parsing is successful");
        } catch (NumberFormatException  e){
            throw  new ArrayException("Invalid lines");
        }
        return intList;
    }
}
