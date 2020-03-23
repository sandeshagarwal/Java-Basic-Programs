import java.util.*;
 class Marks{
  static int EngMarks;
  }
  public class Main{
    public static void main(String args[]){
      Marks obj = new Marks();
      obj.EngMarks = 70;
      Marks obj1 = new Marks();
      obj1.EngMarks = 80;
      Marks.EngMarks = 95; //Accessing without Variables

      System.out.println(obj.EngMarks); // 95
      System.out.println(obj1.EngMarks); // 95
      System.out.println(Marks.EngMarks); // 95
      
      }
}
      
// The output will be the same as these are static variables.
// The value in o/p is the value which is assigned in the last.
