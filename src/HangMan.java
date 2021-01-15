import java.util.Random;

/**
 * This is a class
 * Created 2021-01-15
 *
 * @author Magnus Silverdal
 */   
public class HangMan {
    public static void main(String[] args) {
        String word = pickRandomWord();
    }

    private static String pickRandomWord() {
        String[] words = {"ett","två","tre"};
        Random R = new Random();
        int randomNumber = R.nextInt(words.length);
        return words[randomNumber];
    }

}
