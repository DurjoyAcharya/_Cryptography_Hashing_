//Here i take alphabet veriable for to convert letter to numerical values
//Vigenère Cipher
class VigenerCipher {
  ALPHABET = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  constructor() {}
  public vigenerEncrypt(message: string, key: string): string {
    //This is the text that we want to encrypt
    message = message.toUpperCase();
    key = key.toUpperCase();
    let cipher_text = " ";
    //here i take key index is zero initially to represent the key in numerical values
    let key_index = 0;
    let index = 0;
    for (const i of message) {
      index = (this.ALPHABET.indexOf(i) + this.ALPHABET.indexOf(key[key_index])) % this.ALPHABET.length;
      //   console.log(index);
      cipher_text += this.ALPHABET.charAt(index);
      key_index++;
      if (key_index === key.length) key_index = 0;

    }
    return cipher_text;
  }
  public vigenerDecrypt(message: string, key: string): string {
    //This is the text that we want to encrypt
    message = message.toUpperCase();
    key = key.toUpperCase();
    let cipher_text = " ";
    //here i take key index is zero initially to represent the key in numerical values
    let key_index = 0;
    let index = 0;
    for (const i of message) {
      index = (this.ALPHABET.indexOf(i) - this.ALPHABET.indexOf(key[key_index])) % this.ALPHABET.length;
      //   console.log(index);
      cipher_text += this.ALPHABET.charAt(index);
      key_index++;
      if (key_index === key.length) key_index = 0;

    }
    return cipher_text;
  }

}
//Testing Perpose
let obj = new VigenerCipher();
//console.log(obj.vigenerEncrypt("this is just an example", "secret"));
let sms = obj.vigenerEncrypt("Bangladesh", "secret");
 console.info(sms);
let msm = obj.vigenerDecrypt("UFQYQUWJVZ", "secret");
 console.info(msm);
