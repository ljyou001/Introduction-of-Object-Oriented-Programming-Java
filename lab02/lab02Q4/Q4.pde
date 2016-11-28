int m,d1,d2,y;
import static javax.swing.JOptionPane.*;
int readInt(String msg)
{
   return Integer.parseInt(showInputDialog(msg));  
}
void setup()
{
  int m = readInt("Enter the minute(s):");
  y=m/525600;
  d1=m%525600;
  d2=d1/1440;
  println(m+" minutes is approximately "+y+" years and "+d2+" days.");
}
