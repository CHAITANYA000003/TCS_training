import java.io.*;
import java.util.*;

class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.nextLine().charAt(0);

        int n = s.length();
        int ans = 0;
        int curr = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ch) {
                curr++;
            } else {
                if (curr > 0) {
                    ans += (curr * (curr + 1)) / 2;
                    curr = 0;
                }
            }
        }
        ans += (curr * (curr + 1)) / 2;

        System.out.println(ans);
    }
}