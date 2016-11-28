void setup()
{
  char v= readChar("Enter type(c/b/t):");
  int a= readInt("Enter hours:");
  int sum;
  
  switch(v)
  {
    case 'c':
    sum=20*a;
    println("Parking charge: $"+sum);
    break;
    case 'b':
    sum=30*a;
    println("Parking charge: $"+sum);
    break;
    case 't':
    sum=40*a;
    println("Parking charge: $"+sum);
    break;
  }
  
}

