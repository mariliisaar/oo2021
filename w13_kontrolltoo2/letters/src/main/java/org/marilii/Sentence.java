package org.marilii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.Letter;

public class Sentence implements Letter {
    private List<Word> words;

    public Sentence(String sentence) {
        List<String> list = new ArrayList<String>(Arrays.asList(sentence.split(" ")));
        for(String l : list) {
            Word word = new Word(l);
            words.add(word);
        }
    }

    @Override
    public int getFrequency(Character c) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
