ALBHABET=" ABCDEFGHIJKLMNOPQRSTUVWXYZ"
class VigenerCipher:
    def __init__(self) -> None:
        pass
    def Encrypt(message,key):
        #this is the letter that we want to encrypt+in case sensative
        message=message.upper()
        key=key.upper()
        cipher_text=' '
        key_index=0;
        for char in message:
            index=(ALBHABET.find(char)+ALBHABET.find(key[key_index]))%len(ALBHABET)
            cipher_text+=ALBHABET[index];
            key_index+=0
            if key_index==len(key):
                key_index=0;
        return cipher_text
    def Decrypt(message,key):
        #this is the letter that we want to encrypt+in case sensative
        message=message.upper()
        key=key.upper()
        cipher_text=' '
        key_index=0;
        for char in message:
            index=(ALBHABET.find(char)-ALBHABET.find(key[key_index]))%len(ALBHABET)
            cipher_text+=ALBHABET[index];
            key_index+=0
            if key_index==len(key):
                key_index=0;
        return cipher_text
if __name__=='__main__':
    print(VigenerCipher.Encrypt("I LOVE YOU","SECRET"))
    print(VigenerCipher.Decrypt("ASDGNXSQGM","SECRET"))
