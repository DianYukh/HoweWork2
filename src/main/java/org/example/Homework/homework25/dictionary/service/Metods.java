package org.example.Homework.homework25.dictionary.service;

import org.example.Homework.homework25.dictionary.db.DefaultDictionary;
import org.example.Homework.homework25.dictionary.model.Dictionary;


import java.util.*;

public class Metods {
    private DefaultDictionary defaultDictionary;
    private Dictionary dictionary;


    public Metods() {
        dictionary = new Dictionary();
        defaultDictionary = new DefaultDictionary();
        defaultDictionary.defaultVocabulary();
    }


    public void addWord(String word, String translation) {

        if (!dictionary.getDictionary().containsKey(word)) {
            Set<String> translateSet = new HashSet<>();
            translateSet.add(translation);
            dictionary.getDictionary().put(word, translateSet);
        } else {
            dictionary.getDictionary().get(word).add(translation);
        }
    }

    public void showWord(String word) {
        Map<String, Set<String>> dictionary = new HashMap<>();
        if (dictionary.containsKey(word)) {
            System.out.println(word + " - ");
            for (String translation : dictionary.get(word)) {
                System.out.println(translation);
            }
        } else {
            System.out.println("Цього слова немає у словарі");
        }
    }
}


