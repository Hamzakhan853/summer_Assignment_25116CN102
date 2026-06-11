package Day_11;

public class Q42 {

    static int maximum(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        int result = maximum(15, 25);
        System.out.println("Maximum = " + result);
    }
}
