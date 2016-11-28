void setup()
{
  int[] num = new int[20];
  print("All numbers: ");
  for (int i = 0; i < num.length; i++)
  {
    num[i]= int(random(1, 1000));
    print(num[i]+" ");
  }
  println();
  Oddnum(num);
  Oddindex(num);
  evennum(num);
  allsum(num);
  ismall(num);
  ilarge(num);
}

void Oddnum(int [] odd)
{
  print("Odd numbers: ");
  for (int i = 0; i < odd.length; i++)
  {
    if(odd[i]%2==1)
    {
      print(odd[i]+" ");
    }
  }
  println();
}
void Oddindex(int [] oi)
{
  print("Value at odd numbered index: ");
  for (int i = 0; i < oi.length; i++)
  {
    if(i%2==1)
    {
      print(oi[i]+" ");
    }
  }
  println();
}
void evennum(int [] en)
{
  print("Number of even value: ");
  int s=0;
  for (int i = 0; i < en.length; i++)
  {
   if(en[i]%2==0)
    {
      s++;
    }
  }
  println(s);
}
void allsum(int [] sum)
{
  int s=0;
  print("All number sum: ");
  for (int i = 0; i < sum.length; i++)
  {
    s+=sum[i];
  }
  println(s);
}
void ismall(int [] is)
{
  int min=0;
  int s=is[0];
  print("Index of smallest value: ");
  for (int i = 1; i < is.length; i++)
  {
    if(s>is[i])
    {
      min=i;
      s=is[i];
    }else
    {
      min=min;
      s=s;
    }
  }
  println(min);
}
void ilarge(int [] il)
{
  int max=0;
  int l=il[0];
  print("Index of largest value: ");
  for (int i = 0; i < il.length; i++)
  {
    if(l<il[i])
    {
      max=i;
      l=il[i];
    }else
    {
      max=max;
      l=l;
    }
  }
  println(max);
}


