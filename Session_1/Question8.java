import java.util.*;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<int[]> ans = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if ((n % i) == 0) {
                ans.add(new int[] { i, n / i });
            }
        }

        for (int[] x : ans) {
            System.out.format("(%d, %d), ", x[0], x[1]);
        }
    }
}
