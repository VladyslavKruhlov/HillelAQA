package org.example;

import java.util.List;

public class CountOccurrence {
    public int countOccurrence(List<String> list, String string){
        int count = 0;

        for (String word: list) {
            if(word.equals(string)){
                count++;
            }
        }

        return count;
    }
}
