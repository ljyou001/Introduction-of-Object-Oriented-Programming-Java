int[] x = new int [5];
int[] y = new int [5];
int i, j;
boolean a, b, c, d;

void setup()
{
  size(500, 500);
  for (int i=0; i<5; i=i+1)
  {
    x[i]=50+80*i;
    y[i]=50;
  }
}

void draw()
{
  background(255, 255, 255);
  for (i=0; i<5; i++)
  { 
    rect(x[i], y[i], 50, 50);
    fill(0, 255, 0);
  }
}

