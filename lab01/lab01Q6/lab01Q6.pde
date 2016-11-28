int x,y;

void setup()
{
  size(500, 500);
  x=255;
  y=255;
}

void draw()
{
  background(255,255,255);
  ellipse(x,y,50,50);
  fill(0,0,255);
}
void keyPressed()
{
  if(keyCode==UP){y--;}
  if(keyCode==DOWN){y++;}
  if(keyCode==LEFT){x--;}
  if(keyCode==RIGHT){x++;}
}
