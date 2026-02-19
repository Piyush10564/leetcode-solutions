class Solution {
    public int countBinarySubstrings(String s) {
        
        int count = 0;
        int n = s.length();

        for(int i = 0; i < n - 1; i++) {

            int left = i;
            int right = i + 1;

            // start only when adjacent chars are different
            if(s.charAt(left) == s.charAt(right)) continue;

            // expand
            while(left >= 0 && right < n &&
                  s.charAt(left) == s.charAt(i) &&
                  s.charAt(right) == s.charAt(i + 1)) {

                count++;
                left--;
                right++;
            }
        }
        return count;
    }
}
