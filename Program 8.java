import java.util.*;
public class Main{
public static void main(String args[])
{
  System.out.println("Input the User ID and Password");
  Scanner sc = new Scanner(System.in);
  String uid = sc.next();
  String upwd = sc.next();
  String x="Sandesh";
  String y="1234abcd";
  //Here we can't use uid == x because string used equals() method to equate two strings
  if((uid.equals(x) && upwd.equals(y))||(uid.equals(y) && upwd.equals(x)))
  {
  System.out.println("Password and Username matched");
  }
  else
    System.out.println("Not matched");
 }
 }
