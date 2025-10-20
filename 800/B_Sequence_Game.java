import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B_Sequence_Game {

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
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = fr.nextInt();
            }
            ArrayList<Integer> a = new ArrayList<>();
            a.add(b[0]);
            for (int m = 1; m < n; m++) {
                if (b[m] >= b[m - 1]) {
                    a.add(b[m]);
                } else {
                    a.add(b[m] > 1 ? (b[m] - 1) : 1);
                    a.add(b[m]);
                }
            }
            System.out.println(a.size());
            for (Integer integer : a) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}