import java.util.Scanner;

public class EmployeeInfo
{
    public static void main(String args[])
    {
        String end = "Name\tID\tDepartment\tPosition\n";
        Scanner keyboard = new Scanner(System.in);
        //Employee emp1 = new Employee();
        //emp1.setName("BOB");
        
        
        for (int i=0;i<3;i++)
        {
            System.out.print("Name: ");
            String name = keyboard.nextLine();
           
            System.out.print("ID Number: ");
            int ID = keyboard.nextInt();
            keyboard.nextLine();
            
            System.out.print("Department: ");
            String department = keyboard.nextLine();
           
            System.out.print("position: ");
            String position = keyboard.nextLine();

            Employee emp = new Employee(name,ID,department,position);
            
            end = end+(emp.getName()+"\t"+emp.getId()+"\t"+emp.getDepartment()+"\t"+emp.getPosition()+"\n");
        }
        System.out.print(end);
    }
}
