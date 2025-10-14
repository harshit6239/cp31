import java.util.*;

public class A_Halloumi_Boxes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            if (k >= 2) {
                System.out.println("YES");
            } else {
                boolean flag = false;
                for (int i = 0; i < n - 1; i++) {
                    if (arr[i] > arr[i + 1]) {
                        System.out.println("NO");
                        flag = true;
                        break;
                    }
                }
                if (!flag)
                    System.out.println("YES");
            }
        }
        sc.close();
    }
}