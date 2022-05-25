package OTP;

import java.util.Random;

public class RandomGenerator {
    private Random random;

    public RandomGenerator() {
       random = new Random();
    }

    public int[] generator(int n)
    {
        int[] randomSequence=new int[n];
        for (int i = 0; i < n; i++)
            randomSequence[i]=random.nextInt(0,Constant.ALPHABET.length()-1);
        return randomSequence;
    }
}
