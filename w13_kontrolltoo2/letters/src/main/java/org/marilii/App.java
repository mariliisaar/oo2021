package org.marilii;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        File file = new File("src/main/resources/words.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        PrintWriter pw = new PrintWriter(new FileOutputStream(file, true));

        Sentence s = new Sentence("Kass tahab puu otsa, aga ei saa");
        System.out.println("Lauses \"" + s.getSentence() + "\" on kokku " + s.getFrequency('a') + " \"a\" tähte.");
        System.out.println("Sõnade haaval on \"a\" tähtede hulk järgmine: ");
        for(int i = 0; i < s.getWordCount(); i++) {
            System.out.println(s.getWordAt(i).getWord() + ": " + s.getWordAt(i).getFrequency('a'));
        }
        
        
        List<String> existingWords = new ArrayList<>();
        String toWrite = "";

        if (!file.exists()) {
            file.createNewFile();
        }

        List<Word> wordsToCheck = s.getWords();

        String line = br.readLine();
        if (line == null) {
            for(int i = 0; i < s.getWordCount(); i++) {
                toWrite += s.getWordAt(i).getWord() + " ";
            }
        } else {
            while(line != null) {
                String[] lineData = line.split(";");
                for(int i = 0; i < wordsToCheck.size(); i++) {
                    if (Arrays.asList(lineData).contains(wordsToCheck.get(i).getWord())) {
                        existingWords.add(wordsToCheck.get(i).getWord());
                    }
                }
                for (String extWord : existingWords) {
                    wordsToCheck.removeIf(w -> w.getWord().equals(extWord));
                }
                line = br.readLine();
            }
            for (Word wrd : wordsToCheck) {
                toWrite += wrd.getWord() + " ";
            }
        }

        toWrite = toWrite.trim().replace(' ', ';');

        fr.close();
        br.close();
        if (!toWrite.equals("")) {
            pw.println(toWrite);
        }
        pw.close();
    }
}
