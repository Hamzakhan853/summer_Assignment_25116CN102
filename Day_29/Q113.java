package Day_29;

import java.util.Scanner;
class Q113{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter first number: ");
int a=sc.nextInt();
System.out.print("Enter second number: ");
int b=sc.nextInt();
System.out.println("1.Add");
System.out.println("2.Subtract");
System.out.println("3.Multiply");
System.out.println("4.Divide");
System.out.print("Enter choice: ");
int ch=sc.nextInt();

switch(ch){
case 1:
System.out.println("Answer="+(a+b));
break;
case 2:
System.out.println("Answer="+(a-b));
break;
case 3:
System.out.println("Answer="+(a*b));
break;
case 4:
if(b!=0)
System.out.println("Answer="+(a/b));
else
System.out.println("Division by zero not possible");
break;
default:
System.out.println("Invalid Choice");
}
}
}
