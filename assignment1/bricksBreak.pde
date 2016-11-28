int system;
int expm, eypm, filla, fillb, rnum;
float wally, exm, eym, ex, ey, barx, bary, exms, eyms, vx, vy, time0, time1;
int rectg = readInt("Enter the number of bricks(10-50):");//set the number of rects
float [] rectx = new float [rectg];
float [] recty = new float [rectg];
float [] recta = new float [rectg];
float [] rectb = new float [rectg];
float [] rectxplus = new float [rectg];
float [] rectyplus = new float [rectg];
int [] rectt = new int [rectg];
int [] xpm = new int [rectg];
int [] ypm = new int [rectg];

void setup()//just set up
{
  //system setup
  size(400, 600);
  system=1;//means stage code
  //rect setup
  rnum=rectg;
  if (rectg<10 || rectg>50)
  {
    setup();//deal with illegual number
  }
  for (int i=0; i<rectg; i++)
  {
    //define the vlue of rect
    recta[i]=random(10, 80);
    rectb[i]=random(10, 60);
    rectx[i]=random(0, width-recta[i]);
    recty[i]=random(0, 300-rectb[i]);
    xpm[i]=int(random(0,2));
    ypm[i]=int(random(0,2));
    if(xpm[i]==1)//define the speed of rect
    {
      rectxplus[i]=random(1,3);
    }
    else if(xpm[i]==0)
    {
      rectxplus[i]=random(-3,-1);
    }
    if(ypm[i]==1)
    {
      rectyplus[i]=random(1,3);
    }
    else if(ypm[i]==0)
    {
      rectyplus[i]=random(-3,-1);
    }
  }
  for (int i=0; i<rectg*0.33;i++)//define the type of rect
  {
    rectt[i]=2;
  }
  for (int i=int(rectg*0.33)+1; i<rectg; i++)
  {
    rectt[i]=1;
  } 
  //wall setup
  wally=300;
  //ellipse setup
  ex=width/2;
  ey=height/2-100;
  expm=int(random(0,2));
  eypm=int(random(0,2));
  if(expm==1)//define the speed of ball
  {
    vx=random(1,5);
  }
  else if(expm==0)
  {
    vx=random(-5,-1);
  }
  if(eypm==1)
  {
    vy=random(1,5);
  }
  else if(eypm==0)
  {
    vy=random(-5,-1);
  }
  exm=vx;//mid value for furthur use
  eym=vy;
}
void draw()//code the stage of game
{
  if (system==1)
  {
    system1();
  } else if (system==2)
  {
    system2();
  }else if (system==3)
  {
    system3(1);
  }else if (system==4)
  {
   system3(2); 
  } 
}
void system1()//startup stage
{
  background(0, 0, 0);
  textSize(30);
  int fillw=127+mouseY*128/height;
  fill(fillw, 0, fillw);
  text("Press mouse to start", 50, height/2);
  if (mousePressed)//start the game
  {
    system=2;
    time0=millis();
  }
}
void system2()//game play stage
{
  //system play
  background(255, 255, 255);
  //wall play
  wally+=1.0/15;
  line(0, wally, width, wally);
  //rect play
  for (int i=0; i<rectg;i++)
  {
    if(rectt[i]==2)
    {
      fill(255,0,0);
      rect(rectx[i],recty[i],recta[i],rectb[i]);
      rectx[i]=rectxplus[i]+rectx[i];
      recty[i]=rectyplus[i]+recty[i];
      //define edge
      if(rectx[i]<=0||rectx[i]>=width-recta[i])
      {
        rectxplus[i]=rectxplus[i]*(-1);
      }
      if(recty[i]<=0||recty[i]>=wally-rectb[i])
      {
        rectyplus[i]=rectyplus[i]*(-1);
      }
      //define the bump of red rect and ball
      if(ex+15>=rectx[i] && ex-15<rectx[i]+recta[i] && ey>=recty[i] && ey<=recty[i]+rectb[i])
      {
        rectt[i]--;
        rectxplus[i]=rectxplus[i]*(-1);
        exm=exm*(-1);
      }
      else if(ey+15>=recty[i] && ey-15<=recty[i]+rectb[i] && ex>=rectx[i] && ex<=rectx[i]+recta[i])
      {
        rectt[i]--;
        rectyplus[i]=rectyplus[i]*(-1);
        eym=eym*(-1);
      }
    }
    else if(rectt[i]==1)
    {
      fill(0,0,255);
      rect(rectx[i],recty[i],recta[i],rectb[i]);
      rectx[i]=rectxplus[i]+rectx[i];
      recty[i]=rectyplus[i]+recty[i];
      //define the edge
      if(rectx[i]<=0||rectx[i]>=width-recta[i])
      {
        rectxplus[i]=rectxplus[i]*(-1);
      }
      if(recty[i]<=0||recty[i]>=wally-rectb[i])
      {
        rectyplus[i]=rectyplus[i]*(-1);
      }
      //define the bump of blue rect and ball
      if(ex+15>=rectx[i] && ex-15<rectx[i]+recta[i] && ey>=recty[i] && ey<=recty[i]+rectb[i])
      {
        rectt[i]--;
        rectxplus[i]=rectxplus[i]*(-1);
        exm=exm*(-1);
        rnum--;
      }
      else if(ey+15>=recty[i] && ey-15<=recty[i]+rectb[i] && ex>=rectx[i] && ex<=rectx[i]+recta[i])
      {
        rectt[i]--;
        rectyplus[i]=rectyplus[i]*(-1);
        eym=eym*(-1);
        rnum--;
      }
    }
    else if(rectt[i]==0)//move rects out
    {
      rectx[i]=1000;
      recty[i]=1000;
    }
  }
  //ellipse play
  fill(255,0,0);
  ellipse(ex, ey, 30, 30);
  ex=ex+exm;
  ey=ey+eym;
  //define the edge
  if(ex-15<=0||ex+15>=width)
  {
    exm=exm*(-1);
  }
  if(ey-15<=0||ey+15>height-10&&ex-15<=mouseX+50&&ex+15>=mouseX-50)
  {
    eym=eym*(-1);
  }else if(ey>=height-15)
  {
    exm=0;
    eym=0;
    if(keyPressed)
    {
      ey=ey-5;
      if(vy>0)
      {
        exm=vx;
        eym=vy*(-1);
      }else if(vy<0)
      {
        exm=vx;
        eym=vy;
      }
      wally=wally+15;
    }
  }
  //bar play 
  fill(0,0,255);
  rect(mouseX-50,height-10,100,10);
  //systen end
  for (int i=0; i<rectg; i++)
  {
    if(wally>=height&&rectx[i]>=0&&rectx[i]<=width)
    {
      system=3;
      time1=millis();
    }
    else if(rnum==0)
    {
      system=4;
      time1=millis();
    }
  }
}
void system3(int end)//end stage
{
  background(0,0,0);
  if(end==1)
  {
    int fillw=127+mouseY*128/height;
    fill(0, fillw, fillw);
    text("Failed",width/2-50,height/2-25);
    text("Score is "+int((time1-time0)/100),width/2-90,height/2+25);//mark the score
  }else if(end==2){
    int fillw=127+mouseY*128/height;
    fill(fillw, fillw, 0);
    text("Sucessed",width/2-65,height/2-25);
    text("Score is "+int((time1-time0)/100),width/2-90,height/2+25);//mark the score
  }  
  if(mousePressed)
  {
    setup();//replay
  }
}
