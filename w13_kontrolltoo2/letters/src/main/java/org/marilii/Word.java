package org.marilii;

public class Word implements Letter {
    private String word;

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return this.word;
    }

    @Override
    public int getFrequency(Character c) {
        int counter = 0;
        for (int i = 0; i < this.word.length(); i++) {
            if (this.word.charAt(i) == c) {
                counter++;
            }
        }
        return counter;
    }
    
}
