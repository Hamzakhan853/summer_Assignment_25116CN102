package Day_28;

import java.util.*;
class Q110{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter account holder name: ");
String name=sc.nextLine();
System.out.print("Enter account number: ");
int acc=sc.nextInt();
System.out.print("Enter balance: ");
double balance=sc.nextDouble();
System.out.print("Enter amount to deposit: ");
double deposit=sc.nextDouble();
balance=balance+deposit;
System.out.println("Account Holder: "+name);
System.out.println("Account Number: "+acc);
System.out.println("Updated Balance: "+balance);
}
}