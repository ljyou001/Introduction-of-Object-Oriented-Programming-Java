import static javax.swing.JOptionPane.*;
int readInt(String msg)
{
   return Integer.parseInt(showInputDialog(msg));  
}
void setup()
{
  int a = readInt("Enter an 5-digit number:"); 
  int b = a/10000;
  int c = a%10000 / 1000;
  int d = a%1000 / 100;
  int e = a%100 / 10;
  int f = a%10;
  println(b,c,d,e,f);
}
