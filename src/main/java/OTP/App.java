package OTP;

public class App {
    private static final java.io.BufferedReader br=new java
            .io.BufferedReader(new java.io.InputStreamReader(System.in));
    public static void main(String[] args) {
        String str= null;
        try {
            str = br.readLine();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        var random=new RandomGenerator();
        var otp=new OneTimePad();
        int[] arr=random.generator(str.length());
        var enc=otp.Encryption(str,arr);
        System.out.println(enc);
        var denc=otp.Decryption(enc,arr);
        System.out.println(denc);
    }
}
