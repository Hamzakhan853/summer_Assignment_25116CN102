package Day_21;

import java.util.*;
class Q84{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String result="";
for(int i=0;i<s.length();i++){
char ch=s.charAt(i);

if(ch>='a'&&ch<='z')
result+=(char)(ch-32);
else
result+=ch;
}
System.out.println(result);
}
}
