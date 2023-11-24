package org.example.Homework.homework25.olddictionary;

import org.example.Homework.homework24.Human;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Word {

    private String word;
    private Map<String, String> translation = new HashMap<>();
    private int count;

    public Word() {
    }

    public Word(String word, Map<String, String> translation) {
        this.word = word;
        this.translation = translation;
        this.count = 0;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Map<String, String> getTranslation() {
        return translation;
    }

    public void setTranslation(Map<String, String> translation) {
        this.translation = translation;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}