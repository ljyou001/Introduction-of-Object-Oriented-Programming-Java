import static javax.swing.JOptionPane.*;

int readInt(String msg)
{
   return Integer.parseInt(showInputDialog(msg));  
}

float readFloat(String msg)
{
   return Float.parseFloat(showInputDialog(msg));  
}

double readDouble(String msg)
{
   return Double.parseDouble(showInputDialog(msg));  
}

String readString(String msg)
{
   return showInputDialog(msg);
}

char readChar(String msg)
{
   return showInputDialog(msg).charAt(0);  
}
