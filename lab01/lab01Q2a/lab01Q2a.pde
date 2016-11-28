import static javax.swing.JOptionPane.*;
String readString(String msg)
{
   return showInputDialog(msg);
}
void setup()
{
  String s = readString("Enter your name:"); 
  println("hello "+s+"! Welcome to COMP2007");
}
