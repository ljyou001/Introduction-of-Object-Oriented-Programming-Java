//Finding average of the integers from "start" to "end" inclusive  
void setup()
{
  int startValue = readInt("Enter the start value:");
  int endValue = readInt("Enter the end value:"); 

  if (startValue >= endValue)
  {
    println("The end value is smaller than the start value!");
  } else if (startValue == endValue)
  {
    println("The start value and the end value are the same!");
  } else
  {
    double sum = 0;    
    double average;
    for (int i = startValue; i <= endValue; i++) 
    {
      sum += i;
    }
    average = sum / (endValue - startValue +1 );   
    println("Average is " + average);
  }
}

