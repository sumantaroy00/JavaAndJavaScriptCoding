package JavaCoding.String.SubstringProblems;

public class findNumberDistinctSubsequences {

    public static void main(String[] args) {

       String  s1="rabbbit", s2="rabbit";

       int m = s1.length(), n = s2.length();

       int[] dp = new int[n + 1];

       dp[0] = 1; // empty s2 is a subsequence of any prefix of s1


       for (int i = 1; i <= m; i++) {
        // Traverse s2 backwards to avoid overwriting values needed in this iteration
        for (int j = n; j >= 1; j--) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                dp[j] = dp[j] + dp[j - 1];
            }
        }
    }

    System.out.println(dp[n]);
       
    }
    
}
