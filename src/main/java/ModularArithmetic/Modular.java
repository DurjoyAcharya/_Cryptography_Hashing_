package ModularArithmetic;

public class Modular {
    private static long  virtualModular(long a,long b)
    {
        long ans=b*(a/b);
        return a-ans;
    }
    public static void main(String[] args) {
        long a=17;
        long b=18;
        System.out.println(virtualModular(a,b));
    }
}
