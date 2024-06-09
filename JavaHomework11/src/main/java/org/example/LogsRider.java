package org.example;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class LogsRider {
    public Map<String, Integer> logsRead(String filePath) {

        Map<String, Integer> logCounts = new HashMap<>();

        logCounts.put("INFO", 0);
        logCounts.put("WARN", 0);
        logCounts.put("ERROR", 0);
        logCounts.put("UNKNOWN", 0);

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("[INFO]")) {
                    logCounts.put("INFO", logCounts.get("INFO") + 1);
                } else if (line.startsWith("[WARN]")) {
                    logCounts.put("WARN", logCounts.get("WARN") + 1);
                } else if (line.startsWith("[ERROR]")) {
                    logCounts.put("ERROR", logCounts.get("ERROR") + 1);
                } else {
                    logCounts.put("UNKNOWN", logCounts.get("UNKNOWN") + 1);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return logCounts;
    }
}