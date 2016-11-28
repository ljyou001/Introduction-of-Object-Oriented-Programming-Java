int[] x = new int [10];
int[] y = new int [10];
int i,j;
boolean a,b,c,d;

void setup()
{
  size(500, 500);
  for (int i=0; i<10; i=i+1)
  {x[i]=int(random(0,450));
   y[i]=int(random(0,450));}
}

void draw()
{
  background(255,255,255);
 for (i=0; i<10; i++)
 {
   rect(x[i],y[i],50,50);
   fill(0,255,0);
   if (mouseX>=x[i] && mouseX<=x[i]+50 && mouseY>=y[i] && mouseY<=y[i]+50 )
   {x[i]=-200;}
 }
}


