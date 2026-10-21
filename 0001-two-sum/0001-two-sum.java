class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for( int i=0;i<n;i++){
            int second = target-nums[i];
            if(map.containsKey(second)){
           return new int[]{ map.get(second),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}