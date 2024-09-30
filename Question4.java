import java.util.*;
import java.io.*;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println(0);
        } else if (n == 2) {
            System.out.println(0 + " " + 2);
        } else {
            System.out.print(0 + " " + 2 + " ");
            int prev = 2;
            int adder = 6;
            for (int i = 1; i <= n / 2; i++) {
                prev += adder;
                System.out.print(prev + " ");
                prev += adder;
                System.out.print(prev + " ");
                adder += 4;
            }
        }
    }
}
