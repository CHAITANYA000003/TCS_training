import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxi = arr[0];
        int count = 1;
        for(int i=1; i<n; i++) {
            if(arr[i] > maxi) {
                maxi = arr[i];
                count++;
            }
        }

        System.out.println(count);
    }
}