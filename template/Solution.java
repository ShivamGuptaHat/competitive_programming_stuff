import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    private static Reader in = new Reader();
    private static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    private static void solve() throws Exception {
        
        
    }

    public static void main(String[] args) throws Exception {
        solve();
        out.flush();
        
    }

    
    public static int pow(int n, int a){
        return new Double(Math.pow(n, a)).intValue();
    }

    private static class Reader {
        private BufferedReader reader;
        private StringTokenizer tokenizer;
        Reader() {
            reader = new BufferedReader(new InputStreamReader(System.in));
            tokenizer = new StringTokenizer("");
        }

        String nextLine() throws IOException{
            return reader.readLine();
        }

        String next() throws IOException {
            while (!tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
            return tokenizer.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException{
            return Long.parseLong(next());
        }

        double nextDouble() throws IOException{
            return Double.parseDouble(next());
        }
    }
}