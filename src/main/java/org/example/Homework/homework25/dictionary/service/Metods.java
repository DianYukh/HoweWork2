package org.example.Homework.homework25.dictionary.service;

import org.example.Homework.homework25.dictionary.db.DefaultDictionary;
import org.example.Homework.homework25.dictionary.model.Dictionary;


import java.util.*;

public class Metods {
    private DefaultDictionary defaultDictionary;
    private Dictionary dictionary;
    private Map<String, Integer> count;

    public Metods() {
        dictionary = new Dictionary();
        defaultDictionary = new DefaultDictionary();
        dictionary.getDictionary().putAll(defaultDictionary.defaultVocabulary());
        count = new HashMap<>();
    }


    public void addWord(String word, String translation) {

        if (!dictionary.getDictionary().containsKey(word)) {
            Set<String> translateSet = new HashSet<>();
            translateSet.add(translation);
            dictionary.getDictionary().put(word, translateSet);
            System.out.println("Слово додано успішно " + word);
        } else {
            if (!dictionary.getDictionary().get(word).contains(translation)) {
                dictionary.getDictionary().get(word).add(translation);
                System.out.println("Слово додано до вже існуючого " + word);
            } else {
                System.out.println("Переклад вже існує для цього слова " + word);
            }
        }
        count.put(word, count.getOrDefault(word, 0) + 1);
    }

    public void showWord(String word) {
        if (dictionary.getDictionary().containsKey(word)) {
            System.out.println(word + " - ");
            for (String translation : dictionary.getDictionary().get(word)) {
                System.out.println(translation);
            }
        } else {
            System.out.println("Цього слова немає у словарі");
        }
    }

    public void changeTranslation(String word, String oldTranslation, String newTranslation) {
        if (dictionary.getDictionary().containsKey(word)) {
            Set<String> translationSet = dictionary.getDictionary().get(word);
            if (translationSet.contains(oldTranslation)) {
                translationSet.remove(oldTranslation);
                translationSet.add(newTranslation);
                System.out.println("Переклад змінено успішно для слова: " + word);
            } else {
                System.out.println("Вказаний переклад не знайдено для слова: " + word);
            }
        } else {
            System.out.println("Цього слова немає у словарі: " + word);
        }
    }

    public void addTranslation(String word, String addTranslation) {
        if (dictionary.getDictionary().containsKey(word)) {
            Set<String> translationSet = dictionary.getDictionary().get(word);
            if (!translationSet.contains(addTranslation)) {
                translationSet.add(addTranslation);
                System.out.println("Переклад додано успішно для слова: " + word);
            } else {
                System.out.println("Цей переклад вже існує для слова: " + word);
            }
        } else {
            System.out.println("Цього слова немає у словарі: " + word);
        }
    }
    public void deleteTranslation(String word, String deleteTranslation) {
        if (dictionary.getDictionary().containsKey(word)) {
            Set<String> translationSet = dictionary.getDictionary().get(word);
            if (translationSet.contains(deleteTranslation)) {
                translationSet.remove(deleteTranslation);
                System.out.println("Переклад видалено успішно для слова: " + word);
            } else {
                System.out.println("Цей переклад не знайдено для слова: " + word);
            }
        } else {
            System.out.println("Цього слова немає у словарі: " + word);
        }
    }

    public void deleteWord(String word) {
        if (dictionary.getDictionary().containsKey(word)) {
            dictionary.getDictionary().remove(word);
            System.out.println("Слово видалено успішно: " + word);
        } else {
            System.out.println("Цього слова немає у словарі");
        }
    }
    public void addNewWord(String word) {
        if (dictionary.getDictionary().containsKey(word)) {
          dictionary.getDictionary().put(word, new HashSet<>());
            System.out.println("Слово додано успішно: " + word);
        } else {
            System.out.println("Це слово вже існує у словарі");
        }
    }


    public void changeWord(String word, String newWord) {
        if (dictionary.getDictionary().containsKey(word)) {
            Set<String> translationSet = dictionary.getDictionary().remove(word);
           dictionary.getDictionary().put(newWord,translationSet);

                System.out.println("Слово змінено успішно");
            } else {
                System.out.println("Цього слова немає у словарі: " + word);
            }
        }

    public void showDictionary() {

        for (Map.Entry<String, Set<String>> entry : dictionary.getDictionary().entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public void top10UsefulWords() {
        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(count.entrySet());
        sortedWords.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        int count = 0;
        for (Map.Entry<String, Integer> entry : sortedWords) {
            System.out.println(entry.getKey() + " - Кількість входжень: " + entry.getValue());
            count++;
            if (count >= 10) {
                break;
            }
        }
    }
    public void top10UnUsefulWords() {
        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(count.entrySet());
        sortedWords.sort(Comparator.comparing(Map.Entry::getValue));
        int count = 0;
        for (Map.Entry<String, Integer> entry : sortedWords) {
            System.out.println(entry.getKey() + " - Кількість входжень: " + entry.getValue());
            count++;
            if (count >= 10) {
                break;
            }
        }
    }
    public Map<String, Set<String>> getDictionary() {
        return dictionary.getDictionary();
    }

}


