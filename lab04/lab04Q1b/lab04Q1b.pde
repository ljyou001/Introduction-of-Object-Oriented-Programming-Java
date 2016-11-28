
void setup()
{
  String fname = readString("Enter your first name:");
  String lname = readString("Enter your last name:");
  printWelcomeMsg(lname, fname);
  println("The total game points are " + getGamePoints() + ".");
}

void printWelcomeMsg(String first, String last)
{
  print("Welcome, ");
  print(getFullname(first, last));
  println("!");
}

String getFullname(String first, String last)
{
  return first + " " + last;
}

//sum all the game points input by the user
//user end the input by -1
int getGamePoints()
{
  int sum = 0;
  int input;
  print("Inputs:");
  do
  {
    input = readInt("Enter game points or -1 to end:");
    print(" " + input);
    sum += input;
  }
  while (input != -1);
  println();
  return sum;
}

