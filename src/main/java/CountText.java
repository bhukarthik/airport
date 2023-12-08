import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class CountText {
    private static final Logger LOGGER = (Logger) LogManager.getLogger(CountText.class);

    public static void main(String[] args) throws IOException {
        File myfile = new File("src/main/resources/SearchContent.txt");
        String contents = FileUtils.readFileToString(myfile, StandardCharsets.UTF_8.name());
        if (myfile.exists()) {
            Scanner myScanner = new Scanner(System.in);
            LOGGER.info("Enter the words to be searched: ");
            String searchString = myScanner.nextLine();
            LOGGER.debug("String entered is " + searchString);
            int totalCount = StringUtils.countMatches(contents, searchString);
            LOGGER.info("Total Count of the word " + searchString + " is " + totalCount);
            FileUtils.writeStringToFile(new File("src/main/resources/searchResult.txt"), "Total Count of the word '" + searchString + "' is " + totalCount, Charset.forName("UTF-8"));
        } else {
            LOGGER.error("The file does not exist");
        }
    }
}

