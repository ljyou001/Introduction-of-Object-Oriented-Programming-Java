import java.util.*;
public class BankSystem
{
    public static void main(String args[])
    {
        ArrayList<Account> acList = new ArrayList<Account>();
        //Optional Exercise: Load following accounts from file account.txt
        acList.add(new SavingsAccount("123-111111-888", 10000, 0.03));
        acList.add(new SavingsAccount("123-222222-888", 120000, 0.05));
        acList.add(new CheckingAccount("123-333333-001", 10000, 50)); 
        acList.add(new CheckingAccount("123-444444-001", 150000, 30));
        /////////////////////////////////////////////////////////////
        Scanner keyboard = new Scanner(System.in);
        int option;
        do{
            System.out.println("1. Create New Account");
            System.out.println("2. Close an Account");
            System.out.println("3. Monthly Operation on All Accounts");
            System.out.println("4. Transfer");  
            System.out.println("5. Print All Account Info");
            System.out.println("6. Quit");
            System.out.println();
            System.out.print("Enter the Option: ");
            option = keyboard.nextInt();     
            keyboard.nextLine();//consume the enter char
            //TO DO: Write your code here...
            if (option == 1)
            {
                System.out.println("Select the type of the new account");
                System.out.println("1. Savings Account");
                System.out.println("2. Checking Account");
                System.out.print("Enter account type:");
                int accountType = keyboard.nextInt();
                keyboard.nextLine();
                if (accountType == 1)
                {
                    System.out.print("Enter the account number(XXX-XXXXXX-XXX):");
                    String accountNumber = keyboard.nextLine();
                    System.out.print("Enter the opening balance:");
                    int openingBalance = keyboard.nextInt();
                    keyboard.nextLine();
                    System.out.print("Enter the annual interest rate:");
                    int annualInterestRate = keyboard.nextInt();
                    keyboard.nextLine();
                    acList.add(new SavingsAccount(accountNumber,openingBalance,annualInterestRate));
                    System.out.print("Account "+accountNumber+" was created!");
                }
                if (accountType == 2)
                {
                    System.out.print("Enter the account number(XXX-XXXXXX-XXX):");
                    String accountNumber = keyboard.nextLine();
                    System.out.print("Enter the opening balance:");
                    int openingBalance = keyboard.nextInt();
                    keyboard.nextLine();
                    System.out.print("Enter the annual monthly fee:");
                    int monthlyFee = keyboard.nextInt();
                    keyboard.nextLine();
                    acList.add(new CheckingAccount(accountNumber,openingBalance,monthlyFee));
                    System.out.print("Account "+accountNumber+" was created!");
                }
                System.out.println();
            }
            else if (option == 2)
            {
                int accountNumRm;
                System.out.print("Enter the account number(XXX-XXXXXX-XXX):");
                String accountNumber = keyboard.nextLine();
                System.out.print("Enter the opening balance:");
                for(int i = 0; i < acList.size(); i++)
                {
                    if (acList.get(i).getAccountNum().equals(accountNumber) == true)
                    {
                        accountNumRm = i;
                        acList.remove(accountNumRm);
                    }
                    else
                    {
                        System.out.println("No such account");
                    }
                }
                System.out.println("Account "+accountNumber+" was removed!");
                System.out.println();
            }
            else if (option == 3)
            {
                for(int i = 0; i < acList.size(); i++)
                {
                    if (acList.get(i) instanceof SavingsAccount)
                    {
                        ((SavingsAccount)acList.get(i)).addInterest();
                    }
                    else if (acList.get(i) instanceof CheckingAccount)
                    {
                        ((CheckingAccount)acList.get(i)).chargeFee();
                    }
                }
                System.out.println();
            }
            else if (option == 4)
            {
                int accountNum1 = -1;
                while(accountNum1 == -1)
                {
                    System.out.print("Enter the account number(XXX-XXXXXX-XXX):");
                    String accountNum = keyboard.nextLine();
                    for(int i = 0; i < acList.size(); i++)
                    {
                        if (acList.get(i).getAccountNum().equals(accountNum) == true)
                        {
                            accountNum1 = i;
                            break;
                        }
                    }
                    if(accountNum1 != -1)
                    {
                        break;
                    }
                    System.out.println("No such account");
                }
                int accountNum2 = -1;
                while(accountNum2 == -1)
                {
                    System.out.print("Enter the account number(XXX-XXXXXX-XXX):");
                    String accountNum = keyboard.nextLine();
                    for(int i = 0; i < acList.size(); i++)
                    {
                        if (acList.get(i).getAccountNum().equals(accountNum) == true)
                        {
                            accountNum2 = i;
                            break;
                        }
                    }
                    if(accountNum2 != -1)
                    {
                        break;
                    }
                    System.out.println("No such account");
                }
                System.out.println("Enter the money: ");
                double transMoney = keyboard.nextDouble();
                keyboard.nextLine();
                if(acList.get(accountNum1).debit(transMoney) == true)
                {
                    acList.get(accountNum2).credit(transMoney);
                    System.out.println("$"+transMoney+" was transfered!");
                }
                System.out.println();
            }
            else if (option == 5)
            {
                for(int i = 0; i < acList.size(); i++)
                {
                    System.out.println(acList.get(i).toString());
                }
                System.out.println();
            }
        }while(option != 6);
    }
}