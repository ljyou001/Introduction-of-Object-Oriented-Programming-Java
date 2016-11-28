int [] t =new int[5];
void setup()
{ 
  int a= int(random(0,20));
  println("I am thinking of a number between 1 to 20.");
  println("Can you guess what it is?");
  int i=0;
  for (;i<5;i++)
  {
    t[i] = readInt("Enter 1-20:");
    if(t[i]>a)
    {
      println("You guess: "+t[i]);
      println("You guess is high. Try again!");
    }
    if(t[i]<a)
    {
      println("You guess: "+t[i]);
      println("You guess is low. Try again!");
    }
    if(t[i]==a)
    {
      println("You guess: "+t[i]);
      println("Congratulations! You did it. The number is "+a);
      break;
    }
  }
  if(i>4)
  {
    println("Sorry. The number is "+a+".");
    println("You should have gotten it now.");
    println("Better luck next time.");
  }
}

