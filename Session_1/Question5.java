import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n != 1) {
            if ((n & 1) == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            count++;
        }

        System.out.println(count);
    }
}
