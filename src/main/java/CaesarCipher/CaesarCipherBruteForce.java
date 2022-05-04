package CaesarCipher;

public class CaesarCipherBruteForce {
    private static final String ALPHABET=" ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private void CrackCipher(String cipher_text)
    {
        for (int i = 0; i < ALPHABET.length(); i++) {
          String plainText="";
            for (int j = 0; j < cipher_text.length(); j++) {
                char ch=cipher_text.charAt(j);
                int index=ALPHABET.indexOf(ch);
                index=Math.floorMod((index-i),ALPHABET.length());
                plainText+=ALPHABET.charAt(index);
            }
            System.out.println("Key Values: "+i+" Decrypted Message: "+plainText);
        }
    }
    public static void main(String[] args) {
       // new CaesarCipherBruteForce().CrackCipher("VJKUBKUBCBOGUUCIG");
       // new CaesarCipherBruteForce().CrackCipher("FGHI");
    }
}
