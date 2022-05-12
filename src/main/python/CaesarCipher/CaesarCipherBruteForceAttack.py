ALPHABET=" ABCDEFGHIJKLMNOPQRSTUVWXYZ"
#KEY='?'
class CaesarCipherBruteForceAttack:
    def __init__(self) -> None:
        pass
    #we will try all possible values of length of alphabet
    def crack_Caesar(cipher_text):
        for key in range(len(ALPHABET)):
            #reinitialize all the empty string 
            plain_text=''
            for c in cipher_text:
                index=ALPHABET.find(c);
                index=(index-key)%len(ALPHABET)
                plain_text=plain_text+ALPHABET[index]
            print('key is %s, the result is: %s'%(key,plain_text))
if __name__=='__main__':
    encryptedMessage='VJKUBKUBCBOGUUCIG'
    CaesarCipherBruteForceAttack.crack_Caesar(encryptedMessage)
