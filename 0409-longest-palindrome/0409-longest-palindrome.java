class Solution {
    public int longestPalindrome(String s) {
        int count=0;
        int[] freq = new int[128];
        for( int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        for( int i=0;i<128;i++){
            count += (freq[i]/2)*2;
        }
        if(count<s.length()){
            count++;
        }
        return count;
    }
}