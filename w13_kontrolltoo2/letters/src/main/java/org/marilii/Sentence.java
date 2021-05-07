package org.marilii;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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

    public List<List<String>> checkFile(File file) throws IOException {
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        List<String> existingWords = new ArrayList<>();
        List<String> newWords = new ArrayList<>();
        for(Word w : this.getWords()) {
            newWords.add(w.getWord());
        }
        String line = br.readLine();
        while(line != null) {
            String[] lineData = line.split(";");
            for(int i = 0; i < newWords.size(); i++) {
                if (Arrays.asList(lineData).contains(newWords.get(i))) {
                    existingWords.add(newWords.get(i));
                }
            }
            for (String extWord : existingWords) {
                newWords.removeIf(w -> w.equals(extWord));
            }
            line = br.readLine();
        }
        fr.close();
        br.close();
        List<List<String>> lists = new ArrayList<List<String>>();
        lists.add(newWords);
        lists.add(existingWords);
        return lists;
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
