class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans = 0;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                ans = nums[i];
                break;
            }
        }
        return ans;
    }
}
