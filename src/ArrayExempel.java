import java.util.Arrays;

/**
 * This is a class
 * Created 2020-11-27
 *
 * @author Magnus Silverdal
 */
public class ArrayExempel {
    public static void main(String[] args) {
        int[] tal = {1,2,3,4,5,6,7,8,9,10};
        double medelvärde = medel(tal);
        System.out.println("medelvärdet av talen " + arrayToString(tal) + " är " + medelvärde);
    }

    private static String arrayToString(int[] tal) {
        String resultat = "{";
        for (int i = 0 ; i < tal.length ; i++) {
            resultat += tal[i];
            if (i < tal.length-1)
                resultat += ", ";
        }
        resultat += "}";
        return resultat;
    }

    private static double medel(int[] tal) {
        double resultat = 0;
        int längd = tal.length;
        int summa = 0;
        for (int i = 0 ; i < längd ; i++) {
            summa += tal[i];
        }
        resultat = summa/(double)längd;
        return resultat;
    }

}
