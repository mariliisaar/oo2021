package org.marilii;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Sentence s = new Sentence("Kass tahab õue");
        System.out.println("Lauses \"" + s.getSentence() + "\" on kokku " + s.getFrequency('a') + " \"a\" tähte.");
        System.out.println("Sõnade haaval on \"a\" tähtede hulk järgmine: ");
        for(int i = 0; i < s.getWordCount(); i++) {
            System.out.println(s.getWordAt(i).getWord() + ": " + s.getWordAt(i).getFrequency('a'));
        }
    }
}
