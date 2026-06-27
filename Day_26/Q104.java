package Day_26;

import java.util.*;
class Q104{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int score=0;
System.out.println("What is the capital of India?");
System.out.println("1.Delhi");
System.out.println("2.Mumbai");
System.out.println("3.Chennai");
System.out.print("Enter your answer:");
int ans=sc.nextInt();
if(ans==1){
score++;
System.out.println("Correct");
}
else{
System.out.println("Wrong");
}
System.out.println("Your Score="+score);
sc.close();
}
}
