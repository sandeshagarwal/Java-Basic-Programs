import java.util.*;
public class Main{
public static void main(String args[])
{
person obj1 = new person();
boy obj2 = new boy();

System.out.println("obj1 instanceof person : "+(obj1 instanceof person));
System.out.println("obj1 instanceof boy : "+(obj1 instanceof boy));
System.out.println("obj1 instanceof myinterface : "+(obj1 instanceof myinterface));
System.out.println("obj2 instanceof person : "+(obj2 instanceof person));
System.out.println("obj2 instanceof boy : "+(obj2 instanceof boy));
System.out.println("obj2 instanceof myinterface : "+(obj2 instanceof myinterface));

  }
 
}
class person{
}
class boy extends person implements myinterface{
}
interface myinterface{
}
