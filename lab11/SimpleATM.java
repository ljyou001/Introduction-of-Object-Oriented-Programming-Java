import java.util.*;
public class SimpleATM
{
    public static void main(String args[])
    {
        ArrayList<Account> acList = new ArrayList<Account>();
        Scanner keyboard = new Scanner(System.in);
        //Optional Exercise: Load following accounts from file account.txt
        acList.add(new SavingsAccount("123-111111-888", 10000, 0.03));
        acList.add(new SavingsAccount("123-222222-888", 120000, 0.05));    
        acList.add(new CheckingAccount("123-333333-001", 10000, 50)); 
        acList.add(new CheckingAccount("123-444444-001", 150000, 30));       
        /////////////////////////////////////////////////////////////
        System.out.println("Enter your account number: ");
        int accountNumber = -1;
        while(accountNumber == -1)
        {
            System.out.print("Enter the account number(XXX-XXXXXX-XXX):");
            String accountNum = keyboard.nextLine();
            for(int i = 0; i < acList.size(); i++)
            {
                if (acList.get(i).getAccountNum().equals(accountNum) == true)
                {
                    accountNumber = i;
                    break;
                }
            }
            if(accountNumber != -1)
            {
                break;
            }
            System.out.println("No such account");
        }
        int option;
        do
        {
            System.out.println("1. Account Enquiry");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Quit");
            option = keyboard.nextInt();
            keyboard.nextLine();
            if(option == 1)
            {
                System.out.println("Balance: "+acList.get(accountNumber).getBalance());
            }
            if(option == 2)
            {
                System.out.println("Enter the Deposit Amount:");
                int deposit = keyboard.nextInt();
                keyboard.nextLine();
                acList.get(accountNumber).credit(deposit);
            }
            if(option == 3)
            {
                System.out.println("Enter the Withdraw Amount:");
                int withdraw = keyboard.nextInt();
                keyboard.nextLine();
                acList.get(accountNumber).debit(withdraw);
            }
        }while(option != 4);
    }
}
