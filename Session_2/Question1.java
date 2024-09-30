import java.util.*;

class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int n = s.length();
        int i = 1;
        int curr = 1;
        int ans = 0;
        while (i < n) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                curr++;
            } else {
                if ((curr & 1) == 0) {
                    ans += curr;
                    curr = 0;
                }
            }

            i++;
        }
        if ((curr & 1) == 0) {
            ans += curr;
        }

        System.out.println(ans);
    }
}