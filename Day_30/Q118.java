package Day_30;

import java.util.*;
class Q118{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String[]book=new String[5];
        boolean[]issued=new boolean[5];
        System.out.print("Enter number of books: ");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.print("Book Name: ");
            book[i]=sc.nextLine();
            issued[i]=false;
        }
        System.out.print("Enter book number to issue(1-"+n+"): ");
        int x=sc.nextInt();
        if(x>=1&&x<=n){
            issued[x-1]=true;
        }
        System.out.println("\nLibrary Records");
        for(int i=0;i<n;i++){
            System.out.print(book[i]+" - ");
            if(issued[i]){
                System.out.println("Issued");
            }else{
                System.out.println("Available");
            }
        }
    }
}
