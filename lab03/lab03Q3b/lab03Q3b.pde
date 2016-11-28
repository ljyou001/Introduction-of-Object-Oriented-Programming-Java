void setup()
{
  int a= readInt("Enter a number(0-6):");
  
  switch(a)
  {
    case 0:
    println("Sunday");
    break;
    case 1:
    println("Monday");
    break;
    case 2:
    println("Tuesday");
    break;
    case 3:
    println("Wednesday");
    break;
    case 4:
    println("Thusday");
    break;
    case 5:
    println("Friday");
    break;
    case 6:
    println("Saturday");
    break;
  }
}

