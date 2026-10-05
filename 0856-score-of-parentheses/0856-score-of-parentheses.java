class Solution {
    public int scoreOfParentheses(String s) {
        int count=0;
         int depth =0;
         for( int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(i+1 < s.length() && s.charAt(i+1)==')'){
                    count += (1<<depth);
                }
                depth++;
            }
            else{
                depth--;
            }
         }
         return count;
    }
}