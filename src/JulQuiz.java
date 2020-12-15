import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This is a class
 * Created 2020-12-15
 *
 * @author Magnus Silverdal
 */
public class JulQuiz {
    public static void main(String[] args) {
        String[] questions = {"5+3?", "Hur många bitar är en int i java? \n1) 16 \n2) 28 \n3) 32 \n4) 48"};
        int[] correctAnswers = {8,3};
        System.out.println(questions[1]);

        Scanner input = null;
        try {
            input = new Scanner(new File("quiz.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ArrayList<String> moreQuestions = new ArrayList<>();
        ArrayList<String> moreAnswers = new ArrayList<>();
        ArrayList<Integer> moreCorrectAnswers = new ArrayList<>();

        while (input.hasNext()) {
            moreQuestions.add(input.nextLine());
            moreAnswers.add(input.nextLine());
            moreCorrectAnswers.add(input.nextInt());
            input.nextLine();
        }

    }

}
