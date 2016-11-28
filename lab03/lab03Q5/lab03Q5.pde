void setup()
{
  String s = readString("string:");
  char c = readChar("character:");
  int sum=0;
  for (int i=0;i<s.length();i++)
  {
    if(s.charAt(i)==c)
    {
      sum++;
    }
  }
  println("Number of \'"+c+"\' in \""+s+"\" is "+sum);
}

