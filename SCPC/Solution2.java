/*
You should use the standard input/output

in order to receive a score properly.

Do not use file input and output

Please be very careful.
*/

import java.util.*;
import java.io.*;

/*
   As the name of the class should be Solution , using Solution.java as the filename is recommended.
   In any case, you can execute your program by running 'java Solution' command.
 */
class Solution2 {
    static int Answer;

    public static void main(String args[]) throws Exception	{
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

        for(int test_case = 0; test_case < T; test_case++) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            long minDanger = Long.MAX_VALUE;
            for (int i = 0; i < arr.length - 2; i++) {
                long minD = (arr[i + 2] - arr[i]) / 2;
                minDanger = Math.min(minDanger, minD);
            }

            long maxDanger = 0;
            for (int j = 0; j < arr.length - 3; j++) {
                long maxD = (arr[j + 3] - arr[j]) / 2;
                maxDanger = Math.max(maxDanger, maxD);
            }

            maxDanger = Math.max(maxDanger, arr[2] - arr[0]);
            maxDanger = Math.max(maxDanger, arr[(int)n-1] - arr[(int)n-3]);

            // Print the answer to standard output(screen).
            System.out.println("Case #"+(test_case+1));
            System.out.println(maxDanger + " " + minDanger);
        }
    }
}