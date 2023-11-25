package org.example.Homework.homework2526.dictionary.model;


import java.util.HashSet;
import java.util.Set;

public class Word {

    private String word;
    private Set<String> translation = new HashSet<>();
    private int count;

    public Word() {
        this.count = 0;
    }

    public Word(String word, Set<String> translation) {
        this.word = word;
        this.translation = translation;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Set<String> getTranslation() {
        return translation;
    }

    public void setTranslation(Set<String> translation) {
        this.translation = translation;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}