void setup()
{
  int score= readInt("Enter a score (0 ~ 100):");

  char grade;
  String comment;

  if (score <= 70&&score > 60)
     {grade = 'D';
     comment = "Poor";}
  else if (score <= 80&&score > 70)
     {grade = 'C';
     comment = "Fair";}
  else if (score <= 90&&score > 80)
     {grade = 'B';
     comment = "Average";}
  else if (score < 100&&score > 90)
     {grade = 'A';
     comment = "Good";}
  else if (score == 100)
     {grade = 'S';
     comment = "Excellent";}
  else 
     {grade = 'F';
     comment = "Good Luck!";}
     
  println("Grade: " + grade);
  println("Comment: " + comment);
} 


