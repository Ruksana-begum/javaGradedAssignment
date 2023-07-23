public class LongestPalindromicSubstring {

        public static String longestPalindromicSubstring(String s) {
            int n = s.length();
            if (n == 0) {
                return "";
            }
    
            // Create a 2D dp table initialized with false
            boolean[][] dp = new boolean[n][n];
    
            // All substrings of length 1 are palindromes
            for (int i = 0; i < n; i++) {
                dp[i][i] = true;
            }
    
            int start = 0, maxLen = 1;
    
            // Check for palindromes of length 2
            for (int i = 0; i < n - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    dp[i][i + 1] = true;
                    start = i;
                    maxLen = 2;
                }
            }
    
            // Check for palindromes of length 3 or more
            for (int windowSize = 3; windowSize <= n; windowSize++) {
                for (int i = 0; i < n - windowSize + 1; i++) {
                    int j = i + windowSize - 1;
                    if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                        dp[i][j] = true;
                        if (windowSize > maxLen) {
                            start = i;
                            maxLen = windowSize;
                        }
                    }
                }
            }
    
            return s.substring(start, start + maxLen);
        }
    
        public static void main(String[] args) {
            System.out.println(longestPalindromicSubstring("babad")); // Output: "bab" or "aba"
            System.out.println(longestPalindromicSubstring("cbbd"));  // Output: "bb"
        }
    }
    
    

