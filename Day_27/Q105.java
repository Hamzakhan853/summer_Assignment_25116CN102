package Day_27;

import java.util.*;
class Q105{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String[]name=new String[100];
int[]roll=new int[100];
int count=0;
System.out.print("Enter number of students:");
int n=sc.nextInt();
for(int i=0;i<n;i++){
System.out.print("Enter roll:");
roll[count]=sc.nextInt();
sc.nextLine();
System.out.print("Enter name:");
name[count]=sc.nextLine();
count++;
}
System.out.println("Student Records");
for(int i=0;i<count;i++){
System.out.println("Roll:"+roll[i]);
System.out.println("Name:"+name[i]);
}
}
}