import java.util.Scanner;
public class TestScores
{
    private int s1;
    private int s2;
    private int s3;
    public TestScores(int s1, int s2, int s3){
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
    private int averageScore()
    {
        int s = (s1+s2+s3) / 3;
        return s;
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