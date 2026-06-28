package Day_27;

 import java.util.*;
class Q106{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String[]name=new String[100];
int[]id=new int[100];
double[]salary=new double[100];
System.out.print("Enter number of employees:");
int n=sc.nextInt();
for(int i=0;i<n;i++){
System.out.print("Enter ID:");
id[i]=sc.nextInt();
sc.nextLine();
System.out.print("Enter Name:");
name[i]=sc.nextLine();
System.out.print("Enter Salary:");
salary[i]=sc.nextDouble();
}
System.out.println("Employee Details");
for(int i=0;i<n;i++){
System.out.println("ID:"+id[i]);
System.out.println("Name:"+name[i]);
System.out.println("Salary:"+salary[i]);
}
}
}