import java.util.ArrayList;
public class Message
{
    private String recipient;
    private String sender;
    private String line;
    private String body;
    public void MessageComposser(String recipient, String sender)
    {
        this.recipient = recipient;
        this.sender = sender;
        body="\n";
    }
    public void addLine(String line)
    {
        body=body+"\n"+line;
    }
    public String getText()
    {
        return ("This is the entire text of the message: \nDear "+recipient+","+body+"\n\nSincerely\n\n"+sender);
    }
}