import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_United_We_Stand {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        void close() {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            int n = fr.nextInt();
            int max = Integer.MIN_VALUE;
            int maxCount = 0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = fr.nextInt();
                if (max == a[i])
                    maxCount++;
                else if (max < a[i]) {
                    max = a[i];
                    maxCount = 1;
                }
            }
            if (maxCount == n) {
                System.out.println(-1);
                continue;
            }
            System.out.println(n - maxCount + " " + maxCount);
            for (int i : a) {
                if (i != max)
                    System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < maxCount; i++) {
                System.out.print(max + " ");
            }
            System.out.println();
        }
    }
}