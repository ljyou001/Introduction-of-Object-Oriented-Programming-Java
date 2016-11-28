int x,y;

void setup()
{
  size(500, 500);
  x=100;
  y=200;
}

void draw()
{
  background(255,255,255);
  rect(x,y,100,50);
  fill(0,255,0);
  if (x>=500) {x=-100;}
  else {x=x+1;}
  if (mouseX>=x && mouseX<=x+100 && mouseY>=y && mouseY<=y+50)
  {y=10000;}
}
