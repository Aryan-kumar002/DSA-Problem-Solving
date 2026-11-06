class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n= nums2.length;
        Stack<Integer> stack= new Stack<>();
        int[] nextGreaterElement = new int[n];
        for( int i=n-1;i>=0;i--){
            int element = nums2[i];
            while(!stack.isEmpty() && stack.peek()<=element ){
stack.pop();
            }
            if(stack.isEmpty()){
                nextGreaterElement[i] =-1; 
            }
            else{
                nextGreaterElement[i] = stack.peek();
            }
            stack.push(element);
        }
        int[] result = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            for( int j=0;j<n;j++){
                if(nums1[i]==nums2[j]){
                    result[i]= nextGreaterElement[j];
                }
            }
        }
        return result;
    }
}