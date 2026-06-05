package Day_5;
import java.util.Scanner;
public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
    if (num % i == 0) {
        sum += i;
    }
}
        if (sum == num) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }
    }
}
