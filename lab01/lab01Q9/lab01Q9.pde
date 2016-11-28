int x, y, a;
void setup() 
{   
  size(600, 200);
  x=50;
  y=100; 
  a=2;
} 
void draw() 
{
  background(255, 255, 255);
  drawCar(); 
  x=x+a; 
  if (x+50>=600) {
    a=-2;
  } else if (x-50<=0) {
    a=2;
  }
}
void drawCar() 
{   
  fill(0, 0, 255);
  rect(x-50, y-50, 100, 50); 
  fill(0, 255, 0);
  ellipse(x-25, y+25, 50, 50); 
  fill(0, 255, 0);
  ellipse(x+25, y+25, 50, 50);
}

