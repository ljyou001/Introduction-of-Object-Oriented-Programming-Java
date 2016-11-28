import java.util.Scanner;
public class TestScoresTester
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Please enter the 3 test scores:");
        int s1 = keyboard.nextInt();
        int s2 = keyboard.nextInt();
        int s3 = keyboard.nextInt();
        keyboard.nextLine();
        TestScores student = new TestScores(s1,s2,s3);
        System.out.println("Your grade: "+student.getLetterGrade());
    }
    
}
