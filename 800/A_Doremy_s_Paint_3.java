import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A_Doremy_s_Paint_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int n = sc.nextInt();
            int[] arr = new int[n];
            int dist = 0;
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
                if (map.get(arr[i]) == 1) {
                    dist++;
                }
                if (dist > 2) {
                    flag = true;
                }
            }
            if (flag) {
                System.out.println("NO");
                continue;
            }
            if (dist == 1) {
                System.out.println("YES");
                continue;
            }
            int diff = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                diff = Math.abs(entry.getValue() - diff);
            }
            if (diff <= 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}