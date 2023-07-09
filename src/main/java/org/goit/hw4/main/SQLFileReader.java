package org.goit.hw4.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SQLFileReader {

    public String readFile(String filePath) throws IOException {
        StringBuilder stringBuilder;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            stringBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append("\n");
            }
        }

        return stringBuilder.toString();
    }
}
