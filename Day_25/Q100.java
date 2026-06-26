package Day_25;

import java.util.*;
class Q100{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter number of words: ");
int n=sc.nextInt();
sc.nextLine();
String words[]=new String[n];
System.out.println("Enter words:");
for(int i=0;i<n;i++){
words[i]=sc.nextLine();
}
for(int i=0;i<n-1;i++){
for(int j=i+1;j<n;j++){
if(words[i].length()>words[j].length()){
String temp=words[i];
words[i]=words[j];
words[j]=temp;
}
}
}
System.out.println("Words sorted by length:");
for(int i=0;i<n;i++){
System.out.println(words[i]);
}
}
}
