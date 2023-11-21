package org.example.Homework.homework25;

import java.util.Map;

public class Dictionary {

    private Map<String,String> dictionary;

    public Dictionary(Map<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    public Map<String, String> getDictionary() {
        return dictionary;
    }

    public void setDictionary(Map<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "dictionary=" + dictionary +
                '}';
    }
    public void addWord(String word, String translation){
        dictionary.put(word, translation);
    }

}

