class Solution {
    public List<String> letterCombinations(String digits) {
    List<String> ans = new ArrayList<>();
    if(digits.length()==0){
        return ans;
    }
    String[] arr = { " "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    solve(digits,0,"",ans,arr);
    return ans;
    }
    public void solve(String digits,int index,String s,List<String> ans,String[]arr){
        if(index == digits.length()){
            ans.add(s);
            return;
        }
        String letters =arr[digits.charAt(index)-'0'];
        for(int i=0;i<letters.length();i++){
            solve(digits,index+1, s + letters.charAt(i),ans,arr);
        }
    }
}