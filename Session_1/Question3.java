import java.io.*;
import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] freq = new int[10];

        int n = s.length();
        for (int i = 0; i < n; i++) {
            freq[s.charAt(i) - '0']++;
        }

        String ans = "";
        boolean vis = false;
        for (int i = 1; i <= 9; i++) {
            if (!vis && ans.length() > 0) {
                vis = true;
                ans += String.valueOf(0).repeat(freq[0]);
            }
            ans += String.valueOf(i).repeat(freq[i]);
        }

        System.out.println(ans);
    }
}