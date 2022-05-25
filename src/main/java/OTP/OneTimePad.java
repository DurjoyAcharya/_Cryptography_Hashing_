package OTP;

import java.util.Arrays;
public class OneTimePad {
    public String Encryption(String text,int[] key)
    {
        text=text.toUpperCase();
        String ciphertext="";
        for (int i = 0; i < text.length(); i++) {
           int keyIndex= key[i];
           int charIndex=Constant.ALPHABET.indexOf(text.charAt(i));
           //encryptedLetterIndex=(characterIndex+randomShiftIndex) mod 27
            ciphertext+=Constant.ALPHABET.charAt(Math.floorMod(charIndex+keyIndex,Constant.ALPHABET.length()));
        }
        return ciphertext;
    }
    public String Decryption(String text,int[] key)
    {
        text=text.toUpperCase();
        String ciphertext="";
        for (int i = 0; i < text.length(); i++) {
           int keyIndex= key[i];
           int charIndex=Constant.ALPHABET.indexOf(text.charAt(i));
           //encryptedLetterIndex=(characterIndex+randomShiftIndex) mod 27
            ciphertext+=Constant.ALPHABET.charAt(Math.floorMod(charIndex-keyIndex,Constant.ALPHABET.length()));
        }
        return ciphertext;
    }
}
