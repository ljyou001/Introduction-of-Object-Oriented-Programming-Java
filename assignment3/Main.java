import java.io.*;
import java.util.*;
import java.time.*;
public class Main
{
    public static void main(String args[]) throws FileNotFoundException
    {
        //Logs read
        ArrayList<Record> recordList = new ArrayList<Record>();
        File recordfile = new File("record.dat");
        Scanner record = new Scanner(recordfile);
        while(record.hasNext())
        {
            String dataItem = record.nextLine();
            String[] rtokens = dataItem.split("\t");
            recordList.add(new Record(rtokens[0],rtokens[1],rtokens[2]));
        }
        PrintWriter recordPrinter = new PrintWriter(recordfile);
        //door list read
        ArrayList<Door> doorList = new ArrayList<Door>(); 
        File doorfile = new File("door.dat");
        Scanner door = new Scanner(doorfile);
        while(door.hasNext())
        {
            String dataItem = door.nextLine();
            String[] dtokens = dataItem.split("\t");
            doorList.add(new Door(dtokens[0],dtokens[1],dtokens[2],dtokens[3],dtokens[4],dtokens[5]));
        }
        //user list read
        ArrayList<User> userList = new ArrayList<User>();
        File userfile = new File("user.dat");
        Scanner user = new Scanner(userfile);
        while(user.hasNext())
        {
            String dataItem = user.nextLine();
            String[] utokens = dataItem.split("\t");
            if (utokens[0].equals("Administrator"))
            {
                userList.add(new User(utokens[0],utokens[1],utokens[2]));
            }
            else
            {
                userList.add(new User(utokens[0],utokens[1],utokens[2],utokens[3]));
            }
        }
        //ready to start the program
        Scanner keyboard = new Scanner(System.in);
        int accountNumber = -1;
        String username;
        for(;;)
        {
            int uoption = 1;
            do
            {
                //ask for user name
                System.out.println("Welcome to door access system.");
                System.out.println("Please enter a user ID or type -1 to exit.");
                username = keyboard.nextLine();
                for(int i = 0; i < userList.size(); i++)
                {
                    if (userList.get(i).getId().equals(username) == true)
                    {
                        accountNumber = i;
                        break;
                    }
                }
                if(accountNumber != -1)
                {
                    break;
                }
                System.out.println("No such account.");
            }while(username.equals("-1") == false && accountNumber == -1);
            if(username.equals("-1")==true)
            {
                break;
            }
            //for Administrator user
            if(userList.get(accountNumber).getRoll().equals("Administrator"))
            {
                for(;;)
                {
                    System.out.println("Hello Administrator: "+userList.get(accountNumber).getName());
                    System.out.println("Menu:");
                    System.out.println("\t1\tView a door");
                    System.out.println("\t2\tView a user");
                    System.out.println("\t-1\tQuit");
                    int option = keyboard.nextInt();
                    keyboard.nextLine();
                    if(option == -1)
                    {
                        uoption = -1;
                        break;
                    }
                    else if(option == 1)
                    {
                        //get the door
                        int enterDoorNumber = -1;
                        while(enterDoorNumber == -1)
                        {
                            System.out.print("Enter the Door ID:");
                            String enterDoorID = keyboard.nextLine();
                            for (int i = 0; i < doorList.size(); i++)
                            {
                                if(doorList.get(i).getId().equals(enterDoorID) == true)
                                {
                                    enterDoorNumber = i;
                                    break;
                                }
                            }
                            if (enterDoorNumber != -1)
                            {
                                break;
                            }
                            System.out.println("No such door.");
                        }
                        //get door record
                        int counter = 0;
                        for (int i = 0; i < recordList.size(); i++)
                        {
                            if(recordList.get(i).getDoorName().equals(doorList.get(enterDoorNumber).getId()) == true)
                            {
                                System.out.println(recordList.get(i).toString());
                                counter ++ ;
                            }
                        }
                        if (counter == 0)
                        {
                            System.out.println("No access record");
                        }
                    }
                    else if (option == 2)
                    {
                        //get the user
                        int enterUserNumber = -1;
                        while(enterUserNumber == -1)
                        {
                            System.out.print("Enter the User ID:");
                            String enterUserID = keyboard.nextLine();
                            for (int i = 0; i < userList.size(); i++)
                            {
                                if(userList.get(i).getId().equals(enterUserID) == true)
                                {
                                    enterUserNumber = i;
                                    break;
                                }
                            }
                            if (enterUserNumber != -1)
                            {
                                break;
                            }
                            System.out.println("No such user.");
                        }
                        //get user's access authencation
                        System.out.println("This user can access into these doors:");
                        //check the comdition for the person whether you can access
                        for(int doorCounter = 0; doorCounter < doorList.size(); doorCounter++)
                        {
                            int counter = 0;
                            for (int i = 0; i < doorList.get(doorCounter).getDepartment().length; i++)
                            {
                                for(int j = 0; j < userList.get(enterUserNumber).getDepartment().length; j++)
                                {
                                    if (doorList.get(doorCounter).getDepartment()[i].equals(userList.get(enterUserNumber).getDepartment()[j]))
                                    {
                                        counter++;
                                    }
                                    if(doorList.get(doorCounter).getDepartment()[i].equals("ALL"))
                                    {
                                        counter++;
                                    }
                                }
                            }
                            for (int i = 0; i < doorList.get(doorCounter).getExceptionList().length; i++)
                            {
                                if (doorList.get(doorCounter).getExceptionList()[i].equals(userList.get(enterUserNumber).getId()))
                                {
                                    counter++;
                                }
                            }
                            if (counter != 0)
                            {
                                System.out.print(doorList.get(doorCounter).getId()+" ");
                            }
                        }
                    }
                }
                if(uoption == -1)
                {
                    break;
                }
            }
            //For non-Administrator user
            else
            {
                for(;;)
                {
                    System.out.println("Hello, "+userList.get(accountNumber).getStringDepartment()+
                        " "+userList.get(accountNumber).getRoll()+
                        ": "+userList.get(accountNumber).getName());
                    System.out.println("Menu:");
                    System.out.println("\t1\tAttempt to open a door");
                    System.out.println("\t2\tQuery door opening time");
                    System.out.println("\t3\tSwitch user");
                    System.out.println("\t-1\tQuit");
                    int option = keyboard.nextInt();
                    keyboard.nextLine();
                    if (option == 1)
                    {
                        //To get the door
                        int enterDoorNumber = -1;
                        while(enterDoorNumber == -1)
                        {
                            System.out.print("Enter the Door ID:");
                            String enterDoorID = keyboard.nextLine();
                            for (int i = 0; i < doorList.size(); i++)
                            {
                                if(doorList.get(i).getId().equals(enterDoorID) == true)
                                {
                                    enterDoorNumber = i;
                                    break;
                                }
                            }
                            if (enterDoorNumber != -1)
                            {
                                break;
                            }
                            System.out.println("No such door.");
                        }
                        //check the door whether it is accessible
                        int counter = 0;
                        for (int i = 0; i < doorList.get(enterDoorNumber).getDepartment().length; i++)
                        {
                            for(int j = 0; j < userList.get(accountNumber).getDepartment().length; j++)
                            {
                                if (doorList.get(enterDoorNumber).getDepartment()[i].equals(userList.get(accountNumber).getDepartment()[j]))
                                {
                                    counter++;
                                }
                                if(doorList.get(enterDoorNumber).getDepartment()[i].equals("ALL"))
                                {
                                    counter++;
                                }
                            }
                        }
                        for (int i = 0; i < doorList.get(enterDoorNumber).getExceptionList().length; i++)
                        {
                            if (doorList.get(enterDoorNumber).getExceptionList()[i].equals(userList.get(accountNumber).getId()))
                            {
                                counter++;
                            }
                        }
                        if (counter != 0)
                        {
                            System.out.print(doorList.get(enterDoorNumber).getId()+" ");
                        }
                        boolean timeChecker = false;
                        LocalDateTime currentTime = LocalDateTime.now();
                        String stringTime = null;
                        if(currentTime.getSecond()==0)
                        {
                            stringTime = currentTime.getHour() + ":" +
                            currentTime.getMinute() + ":00" +
                            currentTime.getSecond();
                        }
                        else if(currentTime.getSecond()>0 && currentTime.getSecond()<10)
                        {
                            stringTime = currentTime.getHour() + ":" +
                            currentTime.getMinute() + ":0" +
                            currentTime.getSecond();
                        }
                        else
                        {
                            stringTime = currentTime.getHour() + ":" +
                            currentTime.getMinute() + ":" +
                            currentTime.getSecond();
                        }
                        int time = currentTime.getHour()*10000 + currentTime.getMinute()*100 + currentTime.getSecond();
                        if (time > doorList.get(enterDoorNumber).getStartTime() && 
                        time < doorList.get(enterDoorNumber).getEndTime())
                        {
                            timeChecker = true;
                        }
                        String comment = null;
                        if( counter != 0 && timeChecker == true )
                        {
                            System.out.println("Now you are in!");
                            recordList.add(new Record(doorList.get(enterDoorNumber).getId(),
                                    userList.get(accountNumber).getName(), 
                                    stringTime));
                            for (int i = 0; i < recordList.size(); i++)
                            {
                                comment = recordList.get(i).toString() + "\n";
                            }
                            try
                            {
                                recordPrinter.println(comment);
                            }
                            catch(Exception e)
                            {
                                System.err.println("Error: " + e.getMessage());
                            }
                            finally
                            {
                                if(recordPrinter != null)
                                {
                                    recordPrinter.close();
                                }
                            }
                        }
                        else
                        {
                            System.out.println("You are not allowed to enter the door.");
                        }
                    }
                    else if (option == 2)
                    {
                        //To get the door
                        int enterDoorNumber = -1;
                        while(enterDoorNumber == -1)
                        {
                            System.out.print("Enter the Door ID:");
                            String enterDoorID = keyboard.nextLine();
                            for (int i = 0; i < doorList.size(); i++)
                            {
                                if(doorList.get(i).getId().equals(enterDoorID) == true)
                                {
                                    enterDoorNumber = i;
                                    break;
                                }
                            }
                            if (enterDoorNumber != -1)
                            {
                                break;
                            }
                            System.out.println("No such door.");
                        }
                        //TO do
                        {
                            System.out.println("The door open time is: "+doorList.get(enterDoorNumber).getStringStartTime());
                            System.out.println("The door end time is: "+doorList.get(enterDoorNumber).getStringEndTime());
                            System.out.println("Open it?");
                            System.out.println("1. Yes");
                            System.out.println("2. No");
                            int inoption = keyboard.nextInt();
                            keyboard.nextLine();
                            if (inoption == 1)
                            {
                                //check the door & people info
                                int counter = 0;
                                for (int i = 0; i < doorList.get(enterDoorNumber).getDepartment().length; i++)
                                {
                                    for(int j = 0; j < userList.get(accountNumber).getDepartment().length; j++)
                                    {
                                        if (doorList.get(enterDoorNumber).getDepartment()[i].equals(userList.get(accountNumber).getDepartment()[j]))
                                        {
                                            counter++;
                                        }
                                        if(doorList.get(enterDoorNumber).getDepartment()[i].equals("ALL"))
                                        {
                                            counter++;
                                        }
                                    }
                                }
                                for (int i = 0; i < doorList.get(enterDoorNumber).getExceptionList().length; i++)
                                {
                                    if (doorList.get(enterDoorNumber).getExceptionList()[i].equals(userList.get(accountNumber).getId()))
                                    {
                                        counter++;
                                    }
                                }
                                if (counter != 0)
                                {
                                    System.out.print(doorList.get(enterDoorNumber).getId()+" ");
                                }
                                boolean timeChecker = false;
                                LocalDateTime currentTime = LocalDateTime.now();
                                String stringTime = null;
                                if(currentTime.getSecond()==0)
                                {
                                    stringTime = currentTime.getHour() + ":" +
                                    currentTime.getMinute() + ":00" +
                                    currentTime.getSecond();
                                }
                                else if(currentTime.getSecond()>0 && currentTime.getSecond()<10)
                                {
                                    stringTime = currentTime.getHour() + ":" +
                                    currentTime.getMinute() + ":0" +
                                    currentTime.getSecond();
                                }
                                else
                                {
                                    stringTime = currentTime.getHour() + ":" +
                                    currentTime.getMinute() + ":" +
                                    currentTime.getSecond();
                                }
                                int time = currentTime.getHour()*10000 + currentTime.getMinute()*100 + currentTime.getSecond();
                                if (time > doorList.get(enterDoorNumber).getStartTime() && 
                                time < doorList.get(enterDoorNumber).getEndTime())
                                {
                                    timeChecker = true;
                                }
                                String comment = null;
                                if( counter != 0 && timeChecker == true )
                                {
                                    System.out.println("Now you are in!");
                                    recordList.add(new Record(doorList.get(enterDoorNumber).getId(),
                                            userList.get(accountNumber).getName(), 
                                            stringTime));
                                    for (int i = 0; i < recordList.size(); i++)
                                    {
                                        comment = recordList.get(i).toString() + "\n";
                                    }
                                    try
                                    {
                                        recordPrinter.println(comment);
                                    }
                                    catch(Exception e)
                                    {
                                        System.err.println("Error: " + e.getMessage());
                                    }
                                    finally
                                    {
                                        if(recordPrinter != null)
                                        {
                                            recordPrinter.close();
                                        }
                                    }
                                }
                                else
                                {
                                    System.out.println("You are not allowed to enter the door.");
                                }
                            }
                            else
                            {
                                System.out.println("error choice");
                            }
                        }
                    }
                    else if (option == 3)
                    {
                        uoption = 3;
                        break;
                    }
                    else if (option == -1)
                    {
                        uoption = -1;
                        break;
                    }
                }
                if(uoption == 3)
                {
                    continue;
                }else if(uoption == -1)
                {
                    break;
                }
            }
        }
    }
}