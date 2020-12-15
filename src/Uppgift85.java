/**
 * This is a class
 * Created 2020-11-24
 *
 * @author Magnus Silverdal
 */
public class Uppgift85 {
    public static void main(String[] args) {
//        double svar = nfak(20);
//        System.out.println("20! är lika med " + svar);
    int[] x;
    x = new int[20];
        double binomial = binomialKoeff(5,3);
        System.out.println(binomial);
    }

    private static double binomialKoeff(int n, int k) {
        return nfak(n)/(nfak(k)*(n-k));
    }

    private static double nfak(int n) {
        double result = 1;
        for (int i = 2 ; i <= n ; i++) {
            result *= i;
        }
        return result;
    }
}
