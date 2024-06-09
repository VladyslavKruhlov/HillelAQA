package org.example;

import java.util.Map;

public class Main {
    private static final String INPUT_FILE_PATH = "src/files/log.txt";
    private static final String OUTPUT_FILE_PATH = "src/files/report.txt";

    public static void main(String[] args) {

        LogsRider logsRider = new LogsRider();
        LogsWriter logsWriter = new LogsWriter();

        System.out.println("Reading log file...");
        Map<String, Integer> logCounts = logsRider.logsRead(INPUT_FILE_PATH);
        System.out.println("Writing report file...");
        logsWriter.logsWrite(OUTPUT_FILE_PATH, logCounts);
        System.out.println("Complete");
    }
}