package org.marilii;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class AppTest 
{

    // Test the frequency of letters a, p and e in "pere"
    @Test
    public void letterFrequency()
    {
        Word word = new Word("pere");
        assertEquals(0, word.getFrequency('a'));
        assertEquals(1, word.getFrequency('p'));
        assertEquals(2, word.getFrequency('e'));
    }

    // Test sentence
    @Test
    public void sentenceEquals() {
        Sentence sentence = new Sentence("Kass tahab õue, aga ei saa");
        List<String> words = new ArrayList<>();
        words.add("kass");
        words.add("tahab");
        words.add("õue");
        words.add("aga");
        words.add("ei");
        words.add("saa");
        List<String> actual = new ArrayList<>();
        for(Word w : sentence.getWords()) {
            actual.add(w.getWord());
        }
        assertEquals(words, actual);
        assertEquals(6, sentence.getWordCount());
        assertEquals("Kass tahab õue, aga ei saa", sentence.getSentence());
        assertEquals("tahab", sentence.getWordAt(1).getWord());
    }

    // Test letter frequency in sentence
    @Test
    public void sentenceLetterFrequency() {
        Sentence sentence = new Sentence("Kass tahab õue");
        assertEquals(0, sentence.getFrequency('i'));
        assertEquals(1, sentence.getFrequency('e'));
        assertEquals(3, sentence.getFrequency('a'));
    }

    // Test comparing with file
    @Test
    public void sentenceFile() throws IOException{
        Sentence sentence = new Sentence("Kass tahab õue");
        File file = new File("src/main/resources/test.txt");
        List<String> str = new ArrayList<>();
        List<String> ext = new ArrayList<>();
        str.add("õue");
        ext.add("kass");
        ext.add("tahab");
        PrintWriter pw = new PrintWriter(file);
        pw.println("kass;tahab;puu;otsa;aga;ei;saa");
        pw.close();
        assertEquals(str, sentence.checkFile(file).get(0));
        assertEquals(ext, sentence.checkFile(file).get(1));
    }
}
