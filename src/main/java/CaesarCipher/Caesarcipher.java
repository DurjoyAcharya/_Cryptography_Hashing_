package CaesarCipher;


public class Caesarcipher {
    private final String ALPHABET=" ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private  String EncryptMessages(String message,int key)
    {
        String CipherText="";
        message=message.toUpperCase();
        for (int i = 0; i < message.length(); i++) {
            char character=message.charAt(i);
            int charIndex=ALPHABET.indexOf(character);
            int encryptedIndex=(charIndex+key)%ALPHABET.length();
            CipherText+=ALPHABET.charAt(encryptedIndex);
        }
        return CipherText;
    }
    private  String DecryptMessages(String message,int key)
    {
        String CipherText="";
        message=message.toUpperCase();
        for (int i = 0; i < message.length(); i++) {
            char character=message.charAt(i);
            int charIndex=ALPHABET.indexOf(character);
            int encryptedIndex=(charIndex-key)%ALPHABET.length();
            CipherText+=ALPHABET.charAt(encryptedIndex);
        }
        return CipherText;
    }
    public static void main(String[] args) {
        System.out.println(new Caesarcipher().EncryptMessages("ABC",5));
        System.out.println(new Caesarcipher().DecryptMessages("FGH",5));
    }
}
