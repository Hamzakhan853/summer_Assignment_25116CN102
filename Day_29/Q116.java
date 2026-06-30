package Day_29;

import java.util.Scanner;
class Q116{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String name="";
int quantity=0;
System.out.println("1.Add Product");
System.out.println("2.View Product");
System.out.print("Enter choice: ");
int ch=sc.nextInt();
sc.nextLine();
switch(ch){
case 1:
System.out.print("Enter product name: ");
name=sc.nextLine();
System.out.print("Enter quantity: ");
quantity=sc.nextInt();
System.out.println("Product Added");
break;
case 2:
System.out.println("Product="+name);
System.out.println("Quantity="+quantity);
break;
default:
System.out.println("Invalid Choice");
}
}
}
