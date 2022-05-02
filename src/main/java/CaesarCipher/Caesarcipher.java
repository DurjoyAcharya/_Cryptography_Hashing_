package CaesarCipher;

import java.util.HashMap;
import java.util.Set;

public class Caesarcipher {
    private HashMap<Integer,Character> hashMap;
    public String intToRoman(int num) {
        int[] arr={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] str={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int i= arr.length-1;
        String ans="";
        while (num>0)
        {
            int div=num/arr[i];
            num=num%arr[i];
            while (div>0)
            {
                ans+=str[i];
                div--;
            }
            i--;
        }
        return ans;
    }
    private String encrypt(String message)
    {
        String string="";
        for (int i = 0; i < message.length(); i++) {

        }

        return string;
    }
    private  String EncryptMessages(String message,int key)
    {
        char i;
        int k;
        hashMap=new HashMap<>();
        for ( i= 'A', k=0; k<26 && i <='Z';k++, i++) {
            hashMap.put(k,i);
        }

        for (int j = 0; j < message.length(); j++) {

        }


        hashMap.forEach((x,y)->{
            System.out.println(x+"-"+y);
        });
        return null;
    }
    public static void main(String[] args) {
        new Caesarcipher().EncryptMessages("",9);
    }
}
