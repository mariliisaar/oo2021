package org.marilii;

import static org.junit.Assert.assertEquals;

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
        Sentence sentence = new Sentence("Kass tahab õue");
        List<String> words = new ArrayList<>();
        words.add("Kass");
        words.add("tahab");
        words.add("õue");
        List<String> actual = new ArrayList<>();
        for(Word w : sentence.getWords()) {
            actual.add(w.getWord());
        }
        assertEquals(words, actual);
        assertEquals(3, sentence.getWordCount());
        assertEquals("Kass tahab õue", sentence.getSentence());
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
}
