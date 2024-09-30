import java.util.*;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int char_sum = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                char_sum += ch - 'a' + 1;
            } else if (ch >= 'A' && ch <= 'Z') {
                char_sum += ch - 'A' + 1;
            }
        }

        System.out.println(char_sum);

        // using DIGIT ROOT FORMULA
        int digit_sum = char_sum == 0 ? 0 : 1 + (char_sum - 1) % 9;
        System.out.println(digit_sum);
    }
}
