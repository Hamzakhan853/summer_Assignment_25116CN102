package Day_30;

import java.util.*;
class Q117{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String[]name=new String[5];
        int[]roll=new int[5];
        int[]marks=new int[5];
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Student "+(i+1));
            System.out.print("Name: ");
            name[i]=sc.nextLine();
            System.out.print("Roll: ");
            roll[i]=sc.nextInt();
            System.out.print("Marks: ");
            marks[i]=sc.nextInt();
            sc.nextLine();
        }
        System.out.println("\nStudent Records");
        for(int i=0;i<n;i++){
            System.out.println("Name: "+name[i]);
            System.out.println("Roll: "+roll[i]);
            System.out.println("Marks: "+marks[i]);
            System.out.println();
        }
    }
}
