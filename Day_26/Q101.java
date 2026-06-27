package Day_26;

import java.util.*;
class Q101{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
Random r=new Random();
int number=r.nextInt(100)+1;
int guess;
System.out.println("Guess a number between 1 and 100");
do{
System.out.print("Enter your guess:");
guess=sc.nextInt();
if(guess>number){
System.out.println("Too High");
}
else if(guess<number){
System.out.println("Too Low");
}
else{
System.out.println("Correct! You guessed the number.");
}
}while(guess!=number);
sc.close();
}
}
