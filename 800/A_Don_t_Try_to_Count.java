import java.util.Scanner;

public class A_Don_t_Try_to_Count {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases-- > 0) {
            sc.nextInt();
            sc.nextInt();
            String x = sc.next();
            String s = sc.next();
            boolean flag = false;
            int count = 0;
            do {
                if (x.contains(s)) {
                    System.out.println(count);
                    flag = true;
                    break;
                } else {
                    count++;
                    x = x + x;
                }
            } while (x.length() < 2 * s.length());
            if (!flag) {
                if (x.contains(s))
                    System.out.println(count);
                else
                    System.out.println(-1);
            }
        }
        sc.close();
    }
}