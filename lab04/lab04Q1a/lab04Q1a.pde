//You are not allowed to create any global variables!

void setup()
{
  int [] ranNum = new int[10];
  println("Array elements:");
  for (int i = 1; i < ranNum.length; i++)
  {
    ranNum[i] = int(random(0, 100));
  }
  printArray(ranNum);
  println();
}

void printArray(int[] array)
{
  for (int i = 0; i < array.length; i++)
  {
    print(array[i] + " ");
  }
}

