int[] x = new int [25];
int[] y = new int [25];
int rw=50;
int rh=50;

void setup()
{
  size(500, 500);
}

void draw()
{
  background(255, 255, 255);
  for (int i=0; i<25; i++)
  {
    fill(0,255,0);
    x[i]=50+i % 5 * 80;
    y[i]=50+i / 5 * 80;
    rect(x[i],y[i],rw,rh);
  }
}
