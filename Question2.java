import java.util.Scanner;

public class Question2 {
    public static int fact(int n) {
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }

        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        int e = sc.nextInt();

        int ans = fact(n) / fact(p) * fact(m) / fact(e);

        System.out.println(ans);
    }
}
