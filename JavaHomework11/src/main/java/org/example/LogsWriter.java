package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class LogsWriter {
    public void logsWrite(String outputFilePath, Map<String, Integer> logCounts) {

        try (FileWriter writer = new FileWriter(outputFilePath)) {
            for (Map.Entry<String, Integer> entry : logCounts.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + System.lineSeparator());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}