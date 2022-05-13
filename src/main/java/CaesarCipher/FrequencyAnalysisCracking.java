package CaesarCipher;

import java.util.HashMap;
import java.util.Map;

public class FrequencyAnalysisCracking {
    private Map<Character,Integer> run(String text)
    {
        var frequency=new HashMap<Character,Integer>();
        text=text.toUpperCase();
        for (Character ch:Constants.ALPHABET.toCharArray())
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
        var frequencies=run(text);
        frequencies.forEach((key,value)->{
            System.out.println("Character: "+key+" : Frequency-->"+value);
        });
    }
    public void CrackCeaser(String cipherText)
    {
        var letterFrequencies=run(cipherText);
        Map.Entry<Character,Integer> maxEntry=null;
        for (Map.Entry<Character,Integer>entry: letterFrequencies.entrySet())
        {
            if (entry.getValue().compareTo(maxEntry.getValue())>0)
            {
                maxEntry=entry;
            }
            char mostFrequentChar=maxEntry.getKey();
            int approxKey=Constants.ALPHABET.indexOf(mostFrequentChar)-Constants.ALPHABET.indexOf('E');
            System.out.println("The Value of key is "+approxKey);
        }
    }
    //Crack Ceaser
    public static void main(String[] args) {
        String cipherText;
    }

}
