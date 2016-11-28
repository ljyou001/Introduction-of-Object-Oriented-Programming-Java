import java.util.ArrayList;
import java.util.Scanner;
public class EvenRemover
{
    public static void main(String[] args)
    {
        new EvenRemover();
    }
    public EvenRemover()
    {
        ArrayList<String> words = new ArrayList<String>();
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Enter the inputs:");
        while (keyboard.hasNext())
        {
            words.add(keyboard.next());
        }
        System.out.println("Result:");
        {
            for (int i=0; i<words.size(); i++)
            {
                if(words.get(i).length() % 2 ==1)
                {
                    System.out.println(words.get(i));
                }
            }
        }
    }
}
