class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i = 0; i < n; i++){
            int remaining = target - nums[i];
            if(mpp.containsKey(remaining))
                return new int[]{mpp.get(remaining), i};
            mpp.put(nums[i] , i);
        }
        return new int[] {0,0};
    }
}
