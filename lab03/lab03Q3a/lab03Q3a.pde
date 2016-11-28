void setup()
{
  int a= readInt("Enter the first number:");
  char op= readChar("Enter an operator(+-*/):");
  int b= readInt("Enter the second number:");
  int f;

  switch(op)
  {
    case '+':
    f=a+b;
    println(a+" + "+b+" = "+f);
    break;
    case '-':
    f=a-b;
    println(a+" - "+b+" = "+f);
    break;
    case '*':
    f=a*b;
    println(a+" * "+b+" = "+f);
    break;
    case '/':
    f=a/b;
    println(a+" / "+b+" = "+f);
    break;
    
  }
}

