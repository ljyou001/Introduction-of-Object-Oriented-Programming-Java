void setup() {

  String str1 = readString("Enter the Original String:");
  String str2 = readString("Enter the Specified sequence of char value:");
  println("Original String: " + str1);  
  println("Specified sequence of char value: " + str2);
  if (str2.isEmpty())
  {
    println("It is an empty string");
  } else if (str2.equals("exe")) 
  {
    println(str1+" contains "+str2);
  } else
  {
    println(str1+ " does not contain "+str2);
  }

 
}

