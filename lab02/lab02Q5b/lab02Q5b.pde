void setup() 
{
  String str0 = readString("Enter the Original String:");
  char str1 = readChar("Enter a old char:");
  char str2 = readChar("Enter a new char:");
  println("Original String: " + str1);  
  println("old char: "+str1);
  println("new char: "+str2);
  println("New String: "+str0.replace(str1,str2));
}


