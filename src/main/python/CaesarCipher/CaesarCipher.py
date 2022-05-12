ALPHABET=' ABCDEFGHIJKLMNOPQRSTUVWXYZ' #27
class CaesarCipher:
    def __init__(self) -> None:
        pass
    def caesar_encryption(message,key):
        cipher_text=''
        message=message.upper()
        for i in message:
            index=ALPHABET.find(i)
            index=(index+key)%len(ALPHABET)
            cipher_text+=ALPHABET[index];
        return cipher_text
    def caesar_decryption(message,key):
        cipher_text=''
        for i in message:
            index=ALPHABET.find(i)
            index=(index-key)%len(ALPHABET)
            cipher_text+=ALPHABET[index]
        return cipher_text
if __name__=='__main__':
    encrypt=CaesarCipher.caesar_encryption("I LOVE YOU",5)
    print(encrypt)
    decrypt=CaesarCipher.caesar_decryption(encrypt,5)
    print(decrypt)
