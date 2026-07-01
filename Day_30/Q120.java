package Day_30;

import java.util.*;
class Q120{
    static void display(String[]name,int[]marks,int n){
        System.out.println("\nStudent Details");
        for(int i=0;i<n;i++){
            System.out.println(name[i]+" - "+marks[i]);
        }
    }
    static double average(int[]marks,int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=marks[i];
        }
        return (double)sum/n;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String[]name=new String[5];
        int[]marks=new int[5];
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.print("Name: ");
            name[i]=sc.nextLine();
            System.out.print("Marks: ");
            marks[i]=sc.nextInt();
            sc.nextLine();
        }
        display(name,marks,n);
        System.out.println("Average Marks: "+average(marks,n));
    }
}
