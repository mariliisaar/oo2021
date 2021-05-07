package org.marilii;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        // Lause analüüs - mitu korda esineb täht lauses ja selles sisalduvates sõnades
        Sentence s = new Sentence("Kass tahab puu otsa, aga ei saa.");
        System.out.println("Lauses \"" + s.getSentence() + "\" on kokku " + s.getFrequency('a') + " \"a\" tähte.");
        System.out.println("Sõnade haaval on \"a\" tähtede hulk järgmine: ");
        for(int i = 0; i < s.getWordCount(); i++) {
            System.out.println(s.getWordAt(i).getWord() + ": " + s.getWordAt(i).getFrequency('a'));
        }
        
        // Kontrollime, kas lauses esinenud sõnad on failis olemas. Kui ei, siis lisame need sinna
        File file = new File("src/main/resources/words.txt");
        List<List<String>> lists = s.checkFile(file);
        List<String> newWords = lists.get(0);
        List<String> existingWords = lists.get(1);
        String toWrite = ""; 
        for (String wrd : newWords) {
            toWrite += wrd + " ";
        }
        toWrite = toWrite.trim().replace(' ', ';');

        if (!file.exists()) {
            file.createNewFile();
        }
        PrintWriter pw = new PrintWriter(new FileOutputStream(file, true));
        if (!toWrite.equals("")) {
            pw.println(toWrite);
        }
        pw.close();
        
        // Väljastame, millised lauses olnud sõnad olid uued ja millised olid juba failis olemas
        if (newWords.size() > 0) {
            System.out.println("Uued sõnad olid: ");
            for (String word : newWords) {
                System.out.print(word + " ");
            }
            System.out.println();
        } else {
            System.out.println("Uusi sõnu ei esinenud");
        }

        if  (existingWords.size() > 0) {
            System.out.println("Sõnad, mis olid juba olemas: ");
            for (String word : existingWords) {
                System.out.print(word + " ");
            }
        } else {
            System.out.println("Kõik sõnad selles lauses olid uued");
        }
        
    }
}
