import java.util.*;

public class A_Line_Trip {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int max = 0;
            int[] arr = new int[n + 2];
            arr[0] = 0;
            arr[n + 1] = x;
            for (int i = 1; i <= n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 1; i < arr.length; i++) {
                if (i == arr.length - 1) {
                    max = Math.max(max, 2 * (arr[i] - arr[i - 1]));
                } else {
                    max = Math.max(max, (arr[i] - arr[i - 1]));
                }
            }

            System.out.println(max);
        }
        sc.close();
    }
}