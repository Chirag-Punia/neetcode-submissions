class Solution {
    public boolean isAnagram(String s, String t) {
        int[] mpp1 = new int[26];
        int[] mpp2 = new int[26];
        for(char a : s.toCharArray()){
            mpp1[a - 'a']++;
        }
        for(char a : t.toCharArray()){
            mpp2[a - 'a']++;
        }
        for(int i = 0; i< 26; i++){
            if(mpp1[i] != mpp2[i])return false;
        }
        return true;
    }
}
