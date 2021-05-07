package org.marilii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sentence implements Letter {
    private String sentence;
    private List<Word> words = new ArrayList<>();

    public Sentence(String sentence) {
        this.sentence = sentence;
        List<String> list = new ArrayList<String>(Arrays.asList(sentence.split(" ")));
        for(String l : list) {
            Word w = new Word(l.replaceAll("[^a-zõäöüA-ZÕÄÖÜ ]", "").trim().toLowerCase());
            this.words.add(w);
        }
    }

    public String getSentence() {
        System.out.println(this.sentence);
        return this.sentence;
    }

    public List<Word> getWords() {
        return this.words;
    }

    public Word getWordAt(int i) {
        return this.words.get(i);
    }

    public int getWordCount() {
        return this.words.size();
    }

    @Override
    public int getFrequency(Character c) {
        int counter = 0;
        for(Word w : this.words) {
            counter += w.getFrequency(c);
        }
        return counter;
    }
    
}
