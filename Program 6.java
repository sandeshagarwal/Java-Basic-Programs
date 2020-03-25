import java.util.*;
public class Main{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter two numbers a and b");
float a = sc.nextFloat();
float b = sc.nextFloat();
float res;
System.out.println("Choose the operation '+','-','/','*'");
char ch = sc.next().charAt(0);
switch(ch)
{
case '+': res = a+b;
          break;
case '-': res = a-b;
          break;
case '/': res = a/b;
          break;
case '*': res = a*b;
          break;
default : System.out.println("Error operator is not correct");
          return;
}
System.out.println(res);
}
}
