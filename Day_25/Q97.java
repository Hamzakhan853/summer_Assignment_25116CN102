package Day_25;

import java.util.*;
class Q97{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter size of first array: ");
int n=sc.nextInt();
System.out.print("Enter size of second array: ");
int m=sc.nextInt();
int a[]=new int[n];
int b[]=new int[m];
System.out.println("Enter first sorted array:");
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
System.out.println("Enter second sorted array:");
for(int i=0;i<m;i++){
b[i]=sc.nextInt();
}
int i=0,j=0;
while(i<n&&j<m){
if(a[i]<b[j]){
System.out.print(a[i]+" ");
i++;
}
else{
System.out.print(b[j]+" ");
j++;
}
}
while(i<n){
System.out.print(a[i]+" ");
i++;
}
while(j<m){
System.out.print(b[j]+" ");
j++;
}
}
}
