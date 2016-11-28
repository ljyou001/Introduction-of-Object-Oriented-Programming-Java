void setup()
{
  int i = readInt("Enter a number:");

  if(i==100){println("S Excellent");}
  else if(90<i&&i<100){println("A Good");}
  else if(80<i&&i<=90){println("B Average");}
  else if(70<i&&i<=80){println("C Fair");}
  else if(60<i&&i<=70){println("D Poor");}
  else if(i<=60){println("F Good Luck");}
}




