class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer , Integer> mpp = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int value = mpp.getOrDefault(nums[i], 0);
            if (value != 0)
                return true;
            mpp.put(nums[i], 1);
        }
        return false;
    }
}