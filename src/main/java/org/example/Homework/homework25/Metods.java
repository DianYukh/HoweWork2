package org.example.Homework.homework25;

public class Metods {
    private DefaultDictionary defaultDictionary;
    private Dictionary dictionary;
    public Metods() {
        defaultDictionary = new DefaultDictionary();
      defaultDictionary.defaultVocabulary();
    }
    public void addWord(String word, String translation){
        if(!dictionary.(word)){
            dictionary.put(word, new (word,translation));
        }
        dictionary.get(word).add(translation);
    }


}
