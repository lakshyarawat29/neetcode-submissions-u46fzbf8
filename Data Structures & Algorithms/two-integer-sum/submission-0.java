class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mpp = new HashMap<>();
        int[] ans = new int[2];
        int n = nums.length;
        mpp.put(nums[0],0);
        for(int i=1;i<n;i++){
            if(mpp.containsKey(target-nums[i])){
                ans[0] = mpp.get(target-nums[i]);
                ans[1] = i;
                return ans;
            }

            mpp.put(nums[i],i);
        }

        return ans;
    }
}
