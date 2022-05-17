//Here i take alphabet veriable for to convert letter to numerical values
const ALPHABET = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
class VigenerCipher {
  constructor() {}
  public vigenerEncrypt(message: any, key: string): string {
    //This is the text that we want to encrypt
    message = message.toUpperCase();
    key = key.toUpperCase();
    let cipher_text = " ";
    //here i take key index is zero initially to represent the key in numerical values
    let key_index = 0;
    let index = 0;
    for (const i of message) {
      index =
        (ALPHABET.indexOf(i) + ALPHABET.indexOf(key[key_index])) %
        ALPHABET.length;
      //   console.log(index);
      cipher_text += ALPHABET.charAt(index);
      key_index++;
      if (key_index === key.length) key_index = 0;
    }
    return cipher_text;
  }
  public _decryption(message: any, key: string): string {
    message = message.toUpperCase();
    key = key.toUpperCase();
    let cipher_text = " ";
    //here i take key index is zero initially to represent the key in numerical values
    let key_index = 0;
    let index = 0;
    for (const i of message) {
      index =
        (ALPHABET.indexOf(i) - ALPHABET.indexOf(key[key_index])) %
        ALPHABET.length;
      //   console.log(index);
      cipher_text += ALPHABET.charAt(index);
      key_index++;
      if (key_index === key.length) key_index = 0;
    }
    return cipher_text;

    return " ";
  }
}
//Testing Perpose
let obj = new VigenerCipher();
//console.log(obj.vigenerEncrypt("this is just an example", "secret"));
let sms = obj.vigenerEncrypt("this is just an example", "secret");
console.log(sms);
let msm = obj._decryption(sms, "secret");
console.log(msm);
