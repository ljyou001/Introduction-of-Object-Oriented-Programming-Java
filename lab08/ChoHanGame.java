import java.util.Scanner;
public class ChoHanGame
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to Cho-Han Game!");
        System.out.print("Enter the number of rounds for this game: ");
        int rounds = keyboard.nextInt();
        keyboard.nextLine();
        Dealer dealer = new Dealer();
        int win = 0;
        
        System.out.println("------------------------------------------");

        for (int i = 0; i<rounds; i++)
        {
            System.out.println("Round "+(i+1));
            System.out.print("Enter your guess (odd or even): ");
            String choice = keyboard.nextLine();
            
            dealer.generateNum();  // generate a rabdom number
            System.out.print("Dice values: ");
            for (int j = 0; j < 6; j++)
            {
                System.out.print(dealer.dvalues[j] +" ");
            }
            System.out.println();
            if (choice.equals("even") == true && dealer.dt().equals("even")== true || choice.equals("odd") == true && dealer.dt().equals("odd") == true)
            {
                win++;
                System.out.println("Result: "+ dealer.dt());
                System.out.println("You win!");
            }
            else
            {
                System.out.println("Result: "+ dealer.dt());
                System.out.println("You lose!");
            }

            System.out.println("------------------------------------------");
        }
        System.out.println("You win "+win+" time(s)");
    }
}
