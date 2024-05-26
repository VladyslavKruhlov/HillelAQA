package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindOccurrence {
    public void findOccurrence (List<String> list){
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
        List<Object> res = new ArrayList<>();

        for (Map.Entry<String, Integer> entry: calc.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            res.add("{name:"+"\""+key+"\""+", occurrence: "+value+"}");
        }
            System.out.println(res);
        }
}
