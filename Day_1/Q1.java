package summer_Assignment_25116CN102.Day_1;

import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum = " + sum);
        sc.close();
    }
}
