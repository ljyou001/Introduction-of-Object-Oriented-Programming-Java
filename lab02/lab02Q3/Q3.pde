void setup()
{
  int x = 1;
  int y = 2; 
  int z = 0;

  if (x != 0 && y / x > 0) {
    println("checkpoint 1");
  }
  if (y - z != 1 && x * y * z == 0) {
    println("checkpoint 2");
  }
  if ( x + y == 3 || y / z < 0) {
    println("checkpoint 3");
  }
}

