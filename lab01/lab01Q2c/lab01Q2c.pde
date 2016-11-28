import static javax.swing.JOptionPane.*;
float readFloat(String msg)
{
   return Float.parseFloat(showInputDialog(msg));  
}
void setup()
{
  float a = readFloat("Number1:"); 
  float b = readFloat("Number2:"); 
  float c = readFloat("Number3:"); 
  println("Your numbers forward");
  println(a);
  println(b);
  println(c);
  println("Your numbers reversed");
  println(c);
  println(b);
  println(a);
}
