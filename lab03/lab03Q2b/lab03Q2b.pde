void setup()
{
  int year = readInt("Enter the year: ");
  int month = readInt("Enter the month: ");

  int numDays = 0;
  
  if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
  {
    numDays = 31;
      println("Number of Days = " + numDays);
  }
  else if(month==4||month==6||month==9||month==11)
  {
    numDays = 30;
      println("Number of Days = " + numDays);
  }
  else if(month==2)
  {
     if ( ((year % 4 == 0) && !(year % 100 == 0))
      || (year % 400 == 0) )
      {numDays = 29;
      println("Number of Days = " + numDays);}
    else
      {numDays = 28;
      println("Number of Days = " + numDays);}
  }else
    {println("Invalid month.");}
  
}

