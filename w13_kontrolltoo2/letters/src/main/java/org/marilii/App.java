package org.marilii;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        File file = new File("words.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        List<String> existingWords = new ArrayList<>();
        List<String> newWords = new ArrayList<>();

        Sentence s = new Sentence("Kass tahab õue");
        System.out.println("Lauses \"" + s.getSentence() + "\" on kokku " + s.getFrequency('a') + " \"a\" tähte.");
        System.out.println("Sõnade haaval on \"a\" tähtede hulk järgmine: ");
        for(int i = 0; i < s.getWordCount(); i++) {
            System.out.println(s.getWordAt(i).getWord() + ": " + s.getWordAt(i).getFrequency('a'));
        }

        
    }
}
