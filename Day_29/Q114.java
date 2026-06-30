package Day_29;

import java.util.Scanner;
class Q114{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter size: ");
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
System.out.print("Enter element: ");
arr[i]=sc.nextInt();
}
System.out.println("1.Display");
System.out.println("2.Sum");
System.out.println("3.Maximum");
System.out.print("Enter choice: ");
int ch=sc.nextInt();
switch(ch){
case 1:
for(int i=0;i<n;i++)
System.out.print(arr[i]+" ");
break;
case 2:
int sum=0;
for(int i=0;i<n;i++)
sum+=arr[i];
System.out.println("Sum="+sum);
break;
case 3:
int max=arr[0];
for(int i=1;i<n;i++)
if(arr[i]>max)
max=arr[i];
System.out.println("Maximum="+max);
break;
default:
System.out.println("Invalid Choice");
}
}
}
