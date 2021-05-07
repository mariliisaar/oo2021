package org.marilii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.Letter;

public class Sentence implements Letter {
    private List<Word> words = new ArrayList<>();

    public Sentence(String sentence) {
        List<String> list = new ArrayList<String>(Arrays.asList(sentence.split(" ")));
        for(String l : list) {
            Word w = new Word(l);
            this.words.add(w);
        }
    }

    public String getSentence() {
        String s = "";
        for(Word w : words) {
            s += w.getWord() + " ";
        }
        s = s.trim();
        return s;
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
