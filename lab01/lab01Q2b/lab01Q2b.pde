import static javax.swing.JOptionPane.*;
String readString(String msg)
{
   return showInputDialog(msg);
}
void setup()
{
  String name = readString("His or her name:"); 
  String age = readString("His or her age:");
  String city = readString("The name of a city:");
  String col = readString("The name of a college:");
  String pro = readString("A profession:");
  String ani = readString("A type of animal:");
  String pnam = readString("A pet’s name:");
  println("There once was a person named "+name+" who lived in "+city+". At the age of "+age+", "+name+" went to college at "+col+". "+name+" graduated and went to work as a(n) "+pro+". Then, "+name+" adopted a(n) "+ani+" named "+pnam+". They both lived happily ever after!");
}
