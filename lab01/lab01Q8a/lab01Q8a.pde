int[] x = new int [5];
int[] y = new int [4];
int i, j;
boolean a, b, c, d;

void setup()
{
  size(500, 500);
  for (int i=0; i<5; i=i+1)
  {
    x[i]=50+80*i;
  }
  for (int i=0; i<4; i=i+1)
  {
    y[i]=50+80*i;
  }
}

void draw()
{
  background(255, 255, 255);
  for (i=0; i<5; i++)
  {
    for (j=0; j<4; j++)
    {
      rect(x[i], y[j], 50, 50);
      fill(0, 255, 0);
    }
  }
}

