void setup() 
{
  String str1 = readString("Enter a String 1:");
  String str2 = readString("Enter a String 2:");
  String str3 = readString("Enter a String 3:");
  int a=str1.compareTo(str2);
  int b=str2.compareTo(str3);
  int c=str1.compareTo(str3);
  if (a>0&&b>0&&c>0)
  {
    println(str3);
    println(str2);
    println(str1);
  }
  else if (a>0&&b<0&&c>0)
  {
    println(str2);
    println(str3);
    println(str1);
  }
  else if (a<0&&b>0&&c>0)
  {
    println(str3);
    println(str1);
    println(str2);
  }
  else if (a<0&&b>0&&c<0)
  { 
    println(str3);
    println(str1);
    println(str2);
  }
  else if (a>0&&b<0&&c<0)
  {
    println(str2);
    println(str1);
    println(str3);
  }
  else if (a<0&&b<0&&c<0)
  {
    println(str1);
    println(str2);
    println(str3);
  }
}


