import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution3 {
    static int Answer;

    public static void main(String args[]) throws Exception {
		/*
		   The method below means that the program will read from input.txt, instead of standard(keyboard) input.
		   To test your program, you may save input data in input.txt file,
		   and call below method to read from the file when using nextInt() method.
		   You may remove the comment symbols(//) in the below statement and use it.
		   But before submission, you must remove the freopen function or rewrite comment symbols(//).
		 */

		/*
		   Make new scanner from standard input System.in, and read data.
		 */
        //Scanner sc = new Scanner(System.in);
        //Scanner sc = new Scanner(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        for (int test_case = 0; test_case < T; test_case++) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            long[] dp = new long[n + 1];
            dp[0] = 0;
            for (int i = 1; i <= n; i++) {
                long best = 0;
                int curMax = arr[i - 1], curMin = arr[i - 1];
                for (int j = i - 1; j >= 0; j--) {
                    curMax = Math.max(curMax, arr[j]);
                    curMin = Math.min(curMin, arr[j]);
                    best = Math.max(best, dp[j] + (curMax - curMin));
                }
                dp[i] = best;
            }

            System.out.println("Case #" + (test_case + 1));
            System.out.println(dp[n]);
        }
    }
}