class Solution {
    public boolean hasDuplicate(int[] nums) {
        int cap = 1;
        while (cap < nums.length * 2) cap <<= 1;  // power of two, load factor ≤ 0.5
        int mask = cap - 1;
        int[] table = new int[cap];
        boolean[] used = new boolean[cap];

        for (int n : nums) {
            int h = n * 0x9E3779B9;               // multiplicative hash
            h = (h ^ (h >>> 16)) & mask;
            while (used[h]) {
                if (table[h] == n) return true;
                h = (h + 1) & mask;               // linear probing
            }
            used[h] = true;
            table[h] = n;
        }
        return false;
    }
}