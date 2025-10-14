import java.util.*;

public class A_Cover_in_Water {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int ans = 0;
            int flag = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '.') {
                    if (flag == 2) {
                        ans = 2;
                        break;
                    } else {
                        ans++;
                        flag++;
                    }
                } else {
                    flag = 0;
                }
            }

            System.out.println(ans);
        }
        sc.close();
    }
}