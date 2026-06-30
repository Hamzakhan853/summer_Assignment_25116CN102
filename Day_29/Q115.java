package Day_29;

import java.util.Scanner;

class Q115{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter first string: ");
String s1=sc.nextLine();
System.out.print("Enter second string: ");
String s2=sc.nextLine();
System.out.println("1.Length");
System.out.println("2.Concat");
System.out.println("3.Compare");
System.out.print("Enter choice: ");
int ch=sc.nextInt();
switch(ch){
case 1:
System.out.println("Length="+s1.length());
break;
case 2:
System.out.println("Result="+s1.concat(s2));
break;
case 3:
if(s1.equals(s2))
System.out.println("Strings are Equal");
else
System.out.println("Strings are Not Equal");
break;
default:
System.out.println("Invalid Choice");
}
}
}
