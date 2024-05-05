package org.example;

import java.util.*;

public class Method {
    public void getUniqueWords(String st){
        String regex = "[\\s\\-.,;:!&?*]+";
        String [] words = st.trim().split(regex);

        Set<String> uniqueWords = new LinkedHashSet<>();

        for (String word: words) {
            if (!word.isEmpty()){
                String updatedWord = Character.toUpperCase(word.charAt(0)) + word.substring(1);
                uniqueWords.add(updatedWord);
            } else {
                System.out.println("Error! Your string is empty");
            }
        }

        for (String word: uniqueWords) {
            System.out.println(word);
        }
    }
}
