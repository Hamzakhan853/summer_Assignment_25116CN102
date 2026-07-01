package Day_30;

import java.util.*;
class Q119{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String[]name=new String[5];
        int[]id=new int[5];
        double[]salary=new double[5];
        System.out.print("Enter number of employees: ");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Employee "+(i+1));
            System.out.print("Name: ");
            name[i]=sc.nextLine();
            System.out.print("ID: ");
            id[i]=sc.nextInt();
            System.out.print("Salary: ");
            salary[i]=sc.nextDouble();
            sc.nextLine();
        }
        System.out.println("\nEmployee Details");
        for(int i=0;i<n;i++){
            System.out.println("Name: "+name[i]);
            System.out.println("ID: "+id[i]);
            System.out.println("Salary: "+salary[i]);
            System.out.println();
        }
    }
}
