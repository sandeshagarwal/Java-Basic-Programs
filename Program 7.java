import java.util.*;
public class Main{
  public static void main(String args[]){
    int a=10, b=20, c=30, d=40;
    boolean condition = true;
    //pre increment
    a = ++a;
    System.out.println("a is "+a);
    // post increment
    b = b++;
    System.out.println("b is "+b);
    // pre decrement
    c = --c;
    System.out.println("c is "+c);
    // post decrement
    d = d--;
    System.out.println("d is "+d);
    // Logical Not
    System.out.println("The condition is "+condition);
    }
}
