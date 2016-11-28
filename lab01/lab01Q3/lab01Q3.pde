int x,y,mx,my;

void setup()
{
  size(500, 500);
}

void draw()
{
  background(255);
  mx=mouseX;
  my=mouseY;
  if(mx>x){x=x+2;}
  else if(mx<x){x=x-2;}
  else {x=x;}
  if(my>y){y=y+2;}
  else if(my<y){y=y-2;}
  else {y=y;}
  fill(0, 0, 255);
  ellipse(x, y, 50, 50);
  
}
