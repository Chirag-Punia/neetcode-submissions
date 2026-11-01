class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer , Integer> mpp = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int value = mpp.getOrDefault(nums[i], 0);
            if (value != 0)
                mpp.put(nums[i] , value + 1);
            else
                mpp.put(nums[i], 1);
        }
        int[] ans = new int[1];
        ans[0] = 0;
        mpp.forEach((k,v) -> {
            if (v > 1)
                ans[0] = v;
        });
        return (ans[0] != 0);
    }
}