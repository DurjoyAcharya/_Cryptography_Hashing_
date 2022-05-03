class CaesarCipher {
    constructor() {
    }
    _EncryptMessage(message,key)
    {
        let result=" ";
        let chars=[];
        let Encryptedchars=[];
        for (let i = 0; i <message.length; i++) {
            chars.push(message.charCodeAt(i));
        }
        chars.forEach(e=>{
            Encryptedchars.push((e+key)%128);
        });
        Encryptedchars.forEach(e=>{
           result+=String.fromCharCode(e);
        });
        return result;
    }
    _DecryptMessage(message,key)
    {
        let result=" ";
        let chars=[];
        let Encryptedchars=[];
        for (let i = 0; i <message.length; i++) {
            chars.push(message.charCodeAt(i));
        }
        chars.forEach(e=>{
            Encryptedchars.push((e-key)%128);
        });
        Encryptedchars.forEach(e=>{
           result+=String.fromCharCode(e);
        });
        return result;
    }
}
let caesarcipher=new CaesarCipher();
let value=caesarcipher._EncryptMessage("I LOVE YOU",5);
console.log(value);
console.log(caesarcipher._DecryptMessage("N%QT[J%^TZ",5));