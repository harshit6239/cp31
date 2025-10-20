import java.util.*;
import java.io.*;

public class A_How_Much_Does_Daytona_Cost {
    static int M = (int) (1e9 + 7);
    static FastReader in = new FastReader();
    static FastWriter out = new FastWriter();

    static double PI = 3.1415926535897932384626433832795;

    @SuppressWarnings("unchecked")

    public static void main(String[] args) throws Exception {
        int testcases = 1;
        testcases = in.nextInt();
        outer: while (testcases-- > 0) {
            solve();
        }
        out.close();
    }

    static ArrayList<ArrayList<Integer>> graph;
    static ArrayList<ArrayList<Integer>> graph1;
    static ArrayList<ArrayList<Edge>> g1;
    static ArrayList<ArrayList<Edge>> g2;
    static boolean visited[];
    static int color[];
    static int parent[];
    static ArrayList<ArrayList<Pair>> graphh = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    @SuppressWarnings("unchecked")

    public static void solve() throws Exception {
        // solve the problem here
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = in.nextIntArray(n);
        int i = 0;
        for (i = 0; i < n; i++) {
            if (a[i] == k) {
                out.println("YES");
                return;
            }
            if (i == n - 1) {
                out.println("NO");
                return;
            }
        }
    }

    static int a[];
    static int b[];

    public static boolean check(long kk, int ii) throws Exception {
        int n = a.length;

        HashMap<Long, Integer> h = new HashMap<>();
        for (int i = 0; i < n; i++) {
            long k = 0;
            for (int j = 0; j < 30; j++) {
                if (((kk >> j) & 1) == 1) {
                    int d = (((a[i] >> j) & 1));
                    if (d == 1)
                        k += (1 << j);
                } else {

                }
            }
            addMap(h, k);
        }

        for (int i = 0; i < n; i++) {
            long k = 0;
            for (int j = 0; j < 30; j++) {
                if (((kk >> j) & 1) == 1) {
                    int d = (((b[i] >> j) & 1));
                    d = 1 - d;
                    if (d == 1)
                        k += (1 << j);
                } else {

                }
            }
            if (h.containsKey(k))
                removeMap(h, k);
        }
        return h.size() == 0;

    }

    public static int first(Integer ar[], int k) {
        int n = ar.length;
        if (k > ar[n - 1])
            return n;
        int ans = 0;
        int min = 0;
        int max = n - 1;
        while (max >= min) {
            int mid = min + (max - min) / 2;
            if (ar[mid] >= k) {
                ans = mid;
                max = mid - 1;
            } else
                min = mid + 1;
        }

        return ans;
    }

    public static int last(Integer ar[], int k) {
        if (k < ar[0]) {
            return 0;
        }
        int n = ar.length;
        if (k >= ar[n - 1])
            return n;
        int ans = n - 1;
        int min = 0;
        int max = n - 1;
        while (max >= min) {
            int mid = min + (max - min) / 2;

            if (ar[mid] > k) {
                ans = mid;
                max = mid - 1;
            } else
                min = mid + 1;
        }

        return ans;
    }

    public static long gcd(long a, long b)// Note a>b
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    public static long pow(long a, long n, long M) {
        if (n == 0)
            return 1;
        long ans = 1;
        a %= M;
        while (n != 0) {
            if ((n & 1) == 1) {
                ans = (ans % M * a % M) % M;
            }
            a = (a % M * a % M) % M;
            n /= 2;
        }
        return ans;
    }

    public static int max(int... a) {
        int max = a[0];
        for (int i : a) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static long max(long... a) {
        long max = a[0];
        for (long i : a) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static double max(double... a) {
        double max = a[0];
        for (double i : a) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    // Minimum functions
    public static int min(int... a) {
        int min = a[0];
        for (int i : a) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static long min(long... a) {
        long min = a[0];
        for (long i : a) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static double min(double... a) {
        double min = a[0];
        for (double i : a) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static boolean isSorted(long ar[]) {
        int n = ar.length;
        for (int i = 0; i < n - 1; i++) {
            if (ar[i] > ar[i + 1])
                return false;
        }
        return true;
    }

    public static int maxIntArray(ArrayList<Integer> ar) {
        int max = ar.get(0);
        for (int i = 0; i < ar.size(); i++)
            max = Math.max(max, ar.get(i));
        return max;
    }

    private static int countDigits(long l) {
        if (l >= 1000000000000000000L)
            return 19;
        if (l >= 100000000000000000L)
            return 18;
        if (l >= 10000000000000000L)
            return 17;
        if (l >= 1000000000000000L)
            return 16;
        if (l >= 100000000000000L)
            return 15;
        if (l >= 10000000000000L)
            return 14;
        if (l >= 1000000000000L)
            return 13;
        if (l >= 100000000000L)
            return 12;
        if (l >= 10000000000L)
            return 11;
        if (l >= 1000000000L)
            return 10;
        if (l >= 100000000L)
            return 9;
        if (l >= 10000000L)
            return 8;
        if (l >= 1000000L)
            return 7;
        if (l >= 100000L)
            return 6;
        if (l >= 10000L)
            return 5;
        if (l >= 1000L)
            return 4;
        if (l >= 100L)
            return 3;
        if (l >= 10L)
            return 2;
        return 1;
    }

    public static int minIntArray(ArrayList<Integer> ar) {

        int n = ar.size();
        int max = ar.get(0);
        for (int i = 0; i < n; i++)
            max = Math.min(max, ar.get(i));
        return max;
    }

    public static int maxIntArray(int ar[]) {
        int max = ar[0];
        for (int i = 0; i < ar.length; i++)
            max = Math.max(max, ar[i]);
        return max;
    }

    public static int minIntArray(int ar[]) {

        int max = ar[0];
        for (int i = 0; i < ar.length; i++)
            max = Math.min(max, ar[i]);
        return max;
    }

    public static void endl() throws Exception {
        out.println();
    }

    public static int[] sort(int ar[]) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i : ar)
            al.add(i);
        Collections.sort(al);
        for (int i = 0; i < ar.length; i++)
            ar[i] = al.get(i);
        return ar;
    }

    public static boolean isSorted(int ar[], int n) {
        if (n == 1)
            return true;
        int diff = ar[1] - ar[0];
        for (int i = 1; i < n; i++) {
            diff = Math.min(diff, ar[i] - ar[i - 1]);
        }
        if (diff < 0)
            return false;
        return true;
    }

    public static boolean isSorted(Integer ar[], int n)

    {
        if (n == 1)
            return true;
        int diff = ar[1] - ar[0];
        for (int i = 1; i < n; i++) {
            diff = Math.min(diff, ar[i] - ar[i - 1]);
        }
        if (diff < 0)
            return false;
        return true;
    }

    // public static void addMap(TreeMap<Integer,Integer> map,Integer element)
    // {
    // if(map.containsKey(element))
    // map.put(element,map.get(element)+1);
    // else map.put(element,1);
    // }

    public static <K> void removeMap(Map<K, Integer> map, K element) {
        if (!map.containsKey(element))
            return;
        int currentCount = map.get(element);
        if (currentCount == 1) {
            map.remove(element);
        } else {
            map.put(element, currentCount - 1);
        }
    }

    public static <K> void addMap(Map<K, Integer> map, K element) {
        if (map.containsKey(element)) {
            map.put(element, map.get(element) + 1);
        } else {
            map.put(element, 1);
        }
    }

    // public static void addMap(TreeMap<Integer,Integer> map,Integer element)
    // {
    // if(map.containsKey(element))
    // map.put(element,map.get(element)+1);
    // else map.put(element,1);
    // }
    public static void removeMap(TreeMap<Integer, Integer> map, int element) {
        if (map.get(element) == 1)
            map.remove(element);
        else
            map.put(element, map.get(element) - 1);
    }

    public static void removeMap(TreeMap<Long, Integer> map, long element) {
        if (!map.containsKey(element))
            return;
        if (map.get(element) == 1)
            map.remove(element);
        else
            map.put(element, map.get(element) - 1);
    }

    public static void removeMap(HashMap<Long, Integer> map, long element) {
        if (!map.containsKey(element))
            return;
        if (map.get(element) == 1)
            map.remove(element);
        else
            map.put(element, map.get(element) - 1);
    }

    public static void removeMap(HashMap<Integer, Integer> map, int element) {
        if (map.get(element) == 1)
            map.remove(element);
        else
            map.put(element, map.get(element) - 1);
    }

    public static void removeMap(HashMap<String, Integer> map, String element) {
        if (map.get(element) == 1)
            map.remove(element);
        else
            map.put(element, map.get(element) - 1);
    }
    // public static void addMap(TreeMap<Object,Integer> map,Integer element)
    // {
    // if(map.containsKey(element))
    // map.put(element,map.get(element)+1);
    // else map.put(element,1);
    // }

    public static void addMap(TreeMap<Integer, Integer> map, Integer element) {
        if (map.containsKey(element))
            map.put(element, map.get(element) + 1);
        else
            map.put(element, 1);
    }

    public static void addMap(TreeMap<String, Integer> map, String element) {
        if (map.containsKey(element))
            map.put(element, map.get(element) + 1);
        else
            map.put(element, 1);
    }

    public static void addMap(TreeMap<Long, Integer> map, long element) {
        if (map.containsKey(element))
            map.put(element, map.get(element) + 1);
        else
            map.put(element, 1);
    }

    public static void addMap(HashMap<Integer, Integer> map, int element) {
        if (map.containsKey(element))
            map.put(element, map.get(element) + 1);
        else
            map.put(element, 1);
    }

    public static void addMap(HashMap<Long, Long> map, long element) {
        if (map.containsKey(element))
            map.put(element, map.get(element) + 1);
        else
            map.put(element, 1L);
    }

    public static void addMap(HashMap<Object, Integer> map, Integer element) {
        if (map.containsKey(element))
            map.put(element, map.get(element) + 1);
        else
            map.put(element, 1);
    }

    public static void addMap(HashMap<Long, Integer> map, Long element) {
        if (map.containsKey(element))
            map.put(element, map.get(element) + 1);
        else
            map.put(element, 1);
    }

    public static void addMap(HashMap<String, Integer> map, String element) {
        if (map.containsKey(element))
            map.put(element, map.get(element) + 1);
        else
            map.put(element, 1);
    }

    public static int[] nextIntArray(int n) throws Exception {
        int ar[] = new int[n];
        for (int i = 0; i < n; i++)
            ar[i] = in.nextInt();
        return ar;
    }

    public static long[] nextlongArray(int n) throws Exception// For long
    {
        long ar[] = new long[n];
        for (int i = 0; i < n; i++)
            ar[i] = in.nextLong();
        return ar;
    }

    public static Integer[] nextIntegerArray(int n) throws Exception {
        Integer ar[] = new Integer[n];
        for (int i = 0; i < n; i++)
            ar[i] = in.nextInt();
        return ar;
    }

    public static Long[] nextLongArray(int n)// For Long array
    {
        Long ar[] = new Long[n];
        for (int i = 0; i < n; i++)
            ar[i] = in.nextLong();
        return ar;
    }

    public static String[] nextStringArray(int n) {
        String ar[] = new String[n];
        for (int i = 0; i < n; i++)
            ar[i] = in.next();
        return ar;
    }

    public static void Yes(boolean flag) throws Exception {
        if (flag)
            out.println("Yes");
        else
            out.println("No");
    }

    public static void YES(boolean flag) throws Exception {
        if (flag)
            out.println("YES");
        else
            out.println("NO");
    }

    public static void YES() throws Exception {
        out.println("YES");
    }

    public static void NO() throws Exception {
        out.println("NO");
    }

    public static void Yes() throws Exception {
        out.println("Yes");
    }

    public static void No() throws Exception {
        out.println("No");
    }

    public static void printArrayListPair(ArrayList<Pair> al) throws Exception {
        for (int i = 0; i < al.size(); i++) {
            out.println(al.get(i).a + " " + al.get(i).b);
        }
    }

    public static void printArray(boolean ar[]) throws Exception {
        for (boolean x : ar)
            out.print(x + " ");
        out.println();
    }

    public static void printArray(char ar[]) throws Exception {
        for (char x : ar)
            out.print(x + " ");
        out.println();
    }

    public static void printArray(int ar[]) throws Exception {
        for (int x : ar)
            out.print(x + " ");
        out.println();
    }

    public static void printArray(Object ar[]) throws Exception {
        for (Object x : ar)
            out.print(x + " ");
        out.println();
    }

    public static void printArray(long ar[]) throws Exception {
        for (long x : ar)
            out.print(x + " ");
        out.println();
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
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

        int[] nextIntArray(int n) {
            int ar[] = new int[n];
            for (int i = 0; i < n; i++)
                ar[i] = Integer.parseInt(next());
            return ar;
        }

        long[] nextlongArray(int n) {
            long ar[] = new long[n];
            for (int i = 0; i < n; i++)
                ar[i] = Long.parseLong(next());
            return ar;
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void println() throws IOException {
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }
}

class Edge {
    int a, b;
    long weight;

    Edge(int a, int b, long weight) {
        this.a = a;
        this.b = b;
        this.weight = weight;
    }

    Edge(int a, long weight) {
        this.a = a;
        this.weight = weight;
    }
}

class compareEdge implements Comparator<Edge> {
    public int compare(Edge p1, Edge p2) {
        return Long.compare(p1.weight, p2.weight);
    }
}

class Pair {
    int a, b, c;
    // long a;
    // long b;
    int d;
    boolean flag;

    // Pair(int a,int b,boolean flag)
    // {
    // this.a=a;
    // this.b=b;
    // this.flag=flag;
    // }
    // Pair(long a,long b)
    // {
    // this.a=a;
    // this.b=b;
    // }
    // Pair(long a,long b,long c)
    // {
    // this.a=a;
    // this.b=b;
    // this.c=c;
    // }
    Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }
    // Pair(int a,int b,int c)
    // {
    // this.a=a;
    // this.b=b;
    // this.c=c;
    // }
    // Pair (int a,int b,int c)
    // {
    // this.a=a;
    // this.b=b;
    // this.c=c;
    // }

    // Pair (int a,int b,int c,int d)
    // {
    // this.a=a;
    // this.b=b;
    // this.c=c;
    // this.d=d;
    // }
    @Override
    public String toString() {
        // return a + " " + b + " " + c;
        return a + " " + b;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Pair pair = (Pair) obj;
        // return a == pair.a && b == pair.b && c == pair.c && d == pair.d && flag ==
        // pair.flag;

        return a == pair.a && b == pair.b;
    }

    // @Override
    // public int hashCode() {
    // int result = a;
    // result = 31 * result + b;
    // result = 31 * result + c;
    // result = 31 * result + d;
    // result = 31 * result + (flag ? 1 : 0);
    // return result;
    // }
}

class compare1 implements Comparator<Pair> {
    public int compare(Pair p1, Pair p2) {
        // if(p1.a==p2.a && p2.b==p1.b)return 0;
        // return p2.a-p1.a;//decreasing
        // return p1.c-p2.c;
        // if(p1.a!=p2.a)
        // return p1.a-p2.a;//increasing
        // if(p1.a==p2.b)return p1.b-p2.b;
        return p2.b - p1.b;
        // return p1.b-p2.b;
        // return Long.compare(p1.a,p2.a);

        // if(p1.a!=p2.a)
        // {
        // return p1.a-p2.a;
        // }
        // else
        // return p1.b-p2.b;

        // return Long.compare((p2.a+1)/2*p2.b ,(p1.a+1)/2*p1.b);

        // return p2.a-p1.b;
        // return p1.a-p2.a;
        // return p2.c-p1.c;
        // else
        // return p1.b-p2.b;
        // if(p1.a==p2.a)
        // {
        // return p2.b-p1.b;
        // }
        // else return +p1.a-p2.a;
        // if(p1.a!=p2.a)
        // return p1.a-p2.a;
        // else
        // return p2.b-p1.b;

        // if(p1.a!=p2.a)
        // {
        // return p2.a-p1.a;
        // }
        // else
        // {
        // return p1.b-p2.b;
        // }
    }

    public boolean equals(Pair p1, Pair p2) {
        return p1.a == p2.a && p2.b == p1.b;
    }
}