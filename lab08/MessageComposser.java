import java.util.Scanner;
import java.util.ArrayList;
public class MessageComposser
{
    public static void main(String args[])
    {
        Message mes = new Message();
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Recipient: ");
        String recipient = keyboard.nextLine();

        System.out.print("Sender: ");
        String sender = keyboard.nextLine();

        mes.MessageComposser(recipient,sender);

        System.out.println("Message body: (Press Ctrl+Z to end the input)");
        while(keyboard.hasNext())
        {
            String input = keyboard.nextLine();
            mes.addLine(input);
        }

        System.out.println(mes.getText());
    }
}