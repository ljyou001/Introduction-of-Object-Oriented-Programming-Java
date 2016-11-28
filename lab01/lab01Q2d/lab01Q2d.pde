import static javax.swing.JOptionPane.*;
float readFloat(String msg)
{
   return Float.parseFloat(showInputDialog(msg));  
}
void setup()
{
  float a = readFloat("Enter a number (inch)"); 
  float b = a/12;
  float c = a/36;
  float d = 2.54*a;
  float e = a/39.37;
  println(a+" inches is eqvivalent to");
  println(b+" foot(feet)");
  println(c+" yard(s)");
  println(d+" centimeter(s)");
  println(e+" meter(s)");
}
