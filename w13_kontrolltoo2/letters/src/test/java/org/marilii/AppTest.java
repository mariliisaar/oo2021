package org.marilii;

import static org.junit.Assert.assertEquals;

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
    }
}
