package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalcOccurrence {
    public void calcOccurrence(List<String> list){

        Map<String, Integer> calc = new HashMap<>();

        for(int i=0; i<list.size(); i++){

            String word = list.get(i);
            int value = 0;

            for (String el: list) {
                if(word.equals(el)){
                    value++;
                }
            }
            calc.put(word, value);
        }

        for (Map.Entry<String, Integer> entry: calc.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+":"+ value);
        }
    }
}
