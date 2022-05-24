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
           // ciphertext+=charIndex+Constant.ALPHABET.indexOf()
        }
        return null;
    }
    public static void main(String[] args) {
        //var random=new RandomGenerator();
        int[] arr=new int[5];
        System.out.println(new OneTimePad().Encryption("Right",arr));
    }
}
