package generics_collections;

import java.util.*;

public class CollectionsTest {
    public static void main(String[] args) {
        // remove repeated words in that sentence
        //HashSet
        String texts = "I feel, a feel, a funny feel, a funny feel I feel, " +
                "if you feel the feel  I feel, I feel the feel you feel";
        Set<String> words = new HashSet<>();
        for (String word : texts.split("\\W+")) {
            words.add(word);
        }
        System.out.println("Texts: "+ texts);
        System.out.println("The words used were: ");
        System.out.println(words);
        System.out.println();

        //TreeSet
        // sort the letters used in that sentence into alphabetical order
        String pangram = "the quick brown fox jumps over the lazy dog";
        Set<Character> aToZee = new TreeSet<>();
        for (char gram : pangram.toCharArray()) {
            aToZee.add(gram);
        }
        System.out.println("The pangram: " + pangram);
        System.out.println("Sorted pangram characters are: "+ aToZee);
        System.out.println();

        //ArrayList
        ArrayList<String> languageList = new ArrayList<>();
        languageList.add("C");
        languageList.add("C++");
        languageList.add("Java");
        for (String language : languageList) {
            System.out.println("Language: " + language);
        }
        System.out.println();

       //HashMap
        Map<String, String> misspeltWords  = new HashMap<String, String>();
        misspeltWords.put("calendar", "calendar");
        misspeltWords.put("tomatos", "tomatoes");
        misspeltWords.put("existance", "existence");
        misspeltWords.put("aquaintance", "acquaintance");
        String sentence = "Buy a calendar for year 2013";
        for (String word : sentence.split("\\W+")) {
            if(misspeltWords.containsKey(word)) {
                System.out.println("The correct spelling for " + word + " is: " + misspeltWords.get(word));
            }
        }
        Set<String> keys = misspeltWords.keySet();
        System.out.println("Misspelt words in spellchecker are: ");
        System.out.println(keys);

    }
}
