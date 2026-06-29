package Day_28;

import java.util.*;
class Q109{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter book name: ");
String book=sc.nextLine();
System.out.print("Enter author name: ");
String author=sc.nextLine();
System.out.print("Is book available (true/false): ");
boolean available=sc.nextBoolean();
System.out.println("Book: "+book);
System.out.println("Author: "+author);
if(available){
System.out.println("Book is available");
}else{
System.out.println("Book is not available");
}
}
}
