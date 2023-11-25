package org.example.Homework.homework2526.dictionary.model;


import org.example.Homework.homework2526.dictionary.db.DefaultDictionary;

import java.util.Map;
import java.util.Set;

public class Dictionary {

    private Map<String, Set<String>> dictionary;

    public Dictionary() {
        this.dictionary = new DefaultDictionary().defaultVocabulary();
    }

    public Dictionary(Map<String, Set<String>> dictionary) {
        this.dictionary = dictionary;
    }

    public Map<String, Set<String>> getDictionary() {
        return dictionary;
    }

    public void setDictionary(Map<String, Set<String>> dictionary) {
        this.dictionary = dictionary;
    }

    @Override
    public String toString() {
        return "Dictionary{" + "dictionary=" + dictionary + '}';
    }

}
