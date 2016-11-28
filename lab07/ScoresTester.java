import java.util.ArrayList;
import java.util.Scanner;
public class ScoresTester
{
    public static void main(String[] args)
    {
        ArrayList<Integer> words = new ArrayList<Integer>();
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Enter the scores (end with Ctrl+Z):");
        Scores score = new Scores();
        while(keyboard.hasNext())
        {
            int in = keyboard.nextInt();
            score.addScore(in);
        }
        char c = score.getLetterGrade();
        System.out.println("Your grade: "+c);
    }
}
