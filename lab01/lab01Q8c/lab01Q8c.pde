int[] x = new int [200];
int[] y = new int [200];
int a;
int i, j;

void setup()
{
  size(500, 500);
  for (int i=2; i<7; i=i+1)
  {
    for (int j=7; j<11; j=j+1)
    {
      x[i*j]=50+80*(i-2);
      y[i*j]=50+80*(j-7);
    }
  }
  a=210;
}

void draw()
{
  background(255, 255, 255);
  for (i=2; i<7; i++)
  {
    for (j=7; j<11; j++)
    {
      rect(x[i*j], y[j*i], 50, 50);
      fill(0, 255, 0);
      if (mousePressed && mouseX>=x[i*j] && mouseX<=x[i*j]+50 && mouseY>=y[j*i] && mouseY<=y[j*i]+50 )
      {
        x[i*j]=-100;
      }
    }
  }
  rect(a, 290, 50, 50);
  if (mousePressed && mouseX>=a && mouseX<=a+50 && mouseY>=290 && mouseY<=340)
  {
    a=-100;
  }
}

