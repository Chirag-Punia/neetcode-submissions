class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>(nums.length);
        for (int n : nums){
            if( !seen.add(n)) return true;
        }
        return false;
    }
}