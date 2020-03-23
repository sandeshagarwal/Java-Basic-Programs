import java.util.*;
 class Marks{ // There is only one public class ie. The Main Class
  int EngMarks;
  int MathMarks;
  }
  public class Main{
    public static void main(String args[]){
      Marks obj = new Marks();
      obj.EngMarks = 70;
      obj.MathMarks = 95;
      Marks obj1 = new Marks();
      obj1.EngMarks = 80;
      obj1.MathMarks = 85;
      System.out.println(obj.EngMarks);
      System.out.println(obj1.EngMarks);
      System.out.println(obj.MathMarks);
      System.out.println(obj1.MathMarks);
      }
}
      
  
