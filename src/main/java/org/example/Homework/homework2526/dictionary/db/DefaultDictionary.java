package org.example.Homework.homework2526.dictionary.db;

import java.util.*;

public class DefaultDictionary {




    public Map<String, Set<String>> defaultVocabulary() {
        Map<String, Set<String>> defaultVocabulary = new HashMap<>();
        defaultVocabulary.put("January", new HashSet<>(List.of("січень")));
        defaultVocabulary.put("February", new HashSet<>(List.of("лютий")));
        defaultVocabulary.put("March", new HashSet<>(List.of("березень")));
        defaultVocabulary.put("April", new HashSet<>(List.of("квітень")));
        defaultVocabulary.put("May", new HashSet<>(List.of("травень")));
        defaultVocabulary.put("June", new HashSet<>(List.of("червень")));
        defaultVocabulary.put("July", new HashSet<>(List.of("липень")));
        defaultVocabulary.put("August", new HashSet<>(List.of("серпень")));
        defaultVocabulary.put("September", new HashSet<>(List.of("вересень")));
        defaultVocabulary.put("October", new HashSet<>(List.of("жовтень")));
        defaultVocabulary.put("November", new HashSet<>(List.of("листопад")));
        defaultVocabulary.put("December", new HashSet<>(List.of("грудень")));

        return defaultVocabulary;
    }
}
