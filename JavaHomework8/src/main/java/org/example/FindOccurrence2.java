package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindOccurrence2 {
    public void findOccurrence(List<String> list) {

        Map<String, Long> occurrences = list.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        occurrences.forEach((name, occurrence) ->
                System.out.println("{name:\"" + name + "\", occurrence: " + occurrence + "}"));
    }
}
