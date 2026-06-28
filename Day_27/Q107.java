package Day_27;

import java.util.*;

class Q107{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter number of employees:");
int n=sc.nextInt();
for(int i=0;i<n;i++){
System.out.print("Enter basic salary:");
double basic=sc.nextDouble();
double hra=basic*0.20;
double da=basic*0.10;
double total=basic+hra+da;
System.out.println("Basic:"+basic);
System.out.println("HRA:"+hra);
System.out.println("DA:"+da);
System.out.println("Total Salary:"+total);
}
}
}
