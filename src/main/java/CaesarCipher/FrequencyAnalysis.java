package CaesarCipher;

import java.util.HashMap;
import java.util.Map;

public class FrequencyAnalysis {
    private final String ALPHABET="ABCDEFGHIJKLMNOPQRSTUVQXYZ";
    private Map<Character,Integer> map(String text)
    {
        var frequency=new HashMap<Character,Integer>();
        text=text.toUpperCase();
        for (Character ch:ALPHABET.toCharArray())
            frequency.put(ch,0);
        for (int i = 0; i < text.length(); i++) {
            char ch=text.charAt(i);
            if (text.indexOf(ch)!=-1)
                frequency.put(ch,frequency.get(ch)+1);
        }
        return frequency;
    }
    public void showFrequencies(String text)
    {
        var frequencies=map(text);
        frequencies.forEach((key,value)->{
            System.out.println("Character: "+key+" : Frequency-->"+value);
        });
    }
    public static void main(String[] args) {
        String text="ABBA";
        var analysis=new FrequencyAnalysis();
        analysis.showFrequencies(text);
    }
}
