int x,y;

void setup()
{
  size(500, 500);
  x=255;
  y=0;
}

void draw()
{
  background(x,x,x);
  if (key=='r'||key=='R')
  {background(x,y,y);}
  else if (key=='g'||key=='G')
  {background(y,x,y);}
  else if (key=='B'||key=='b')
  {background(y,y,x);}
}
