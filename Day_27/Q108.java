package Day_27;

import java.util.*;

class Q108{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter student name:");
String name=sc.nextLine();
System.out.print("Enter marks of 5 subjects:");
int total=0;
for(int i=1;i<=5;i++){
total+=sc.nextInt();
}
double per=total/5.0;
String grade;
if(per>=90)
grade="A";
else if(per>=75)
grade="B";
else if(per>=60)
grade="C";
else if(per>=40)
grade="D";
else
grade="Fail";
System.out.println("Name:"+name);
System.out.println("Total:"+total);
System.out.println("Percentage:"+per);
System.out.println("Grade:"+grade);
}
}
