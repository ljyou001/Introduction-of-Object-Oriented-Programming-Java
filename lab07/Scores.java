import java.util.ArrayList;
import java.util.Scanner;
public class Scores
{
    private ArrayList<Integer> sc;
    private int in;
    public Scores()
    {
        sc = new ArrayList<Integer>();
    }
    public void addScore(int in)
    {
        sc.add(in);
    }
    private int averageScore()
    {
        int add=0;
        int avg=0;
        for (int i = 0; i<sc.size(); i++)
        {
            add=add+sc.get(i);
        }
        avg= add / sc.size();
        return avg;
    }
    public char getLetterGrade()
    {
        int ave = averageScore();
        
        if(ave >= 90)
        {
            return 'A';
        }
        else if(ave >= 80 && ave <90)
        {
            return 'B';
        }
        else if(ave >= 70 && ave <80)
        {
            return 'C';
        }
        else if(ave >= 60 && ave <70)
        {
            return 'D';
        }
        else if(ave <60)
        {
            return 'F';
        }
        else
        {
            return 0;
        }
    }
}
